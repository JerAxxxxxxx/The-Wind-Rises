package com.windrises.system.arithmetic.array;

/**
 * 至少是其他数字两倍的最大数
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/5/8 12:30
 */
public class Main2 {

    /**
     * 在一个给定的数组nums中，总是存在一个最大元素 。
     * <p>
     * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
     * <p>
     * 如果是，则返回最大元素的索引，否则返回-1。
     * <p>
     * <p>
     * 输入: nums = [3, 6, 1, 0]
     * 输出: 1
     * 解释: 6是最大的整数, 对于数组中的其他整数,
     * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
     */
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 2, 1};
        System.out.println(dominantIndex(arr1));
    }

    /**
     * nums 的长度范围在[1, 50].
     * 每个 nums[i] 的整数范围在 [0, 100].
     *
     * @param nums
     * @return
     */
    public static int dominantIndex(int[] nums) {
        int result = -1;
        if (nums.length > 1) {
            int max = nums[0];
            int second = nums[1];
            int index = 0;
            int maxIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    second = max;
                    max = nums[i];
                    index = i;
                    maxIndex = i;
                } else if (nums[i] < max && nums[i] > second) {
                    second = nums[i];
                } else if (second == 0) {
                    index = maxIndex;
                }
            }
            if (max != 0) {
                if (second * 2 <= max) {
                    result = index;
                }
            }
        } else {
            result = 0;
        }
        return result;
    }

    public static int methid(int[] nums){
        int max = 0;
        boolean pin = true;
        for(int i = 1; i < nums.length; i++) {
            if(nums[max] < nums[i]) {
                pin = nums[i] >= nums[max] * 2;
                max = i;
            } else {
                if(nums[max] < nums[i] * 2) {
                    pin = false;
                }
            }
        }
        if(pin) {
            return max;
        } else {
            return -1;
        }
    }
}
