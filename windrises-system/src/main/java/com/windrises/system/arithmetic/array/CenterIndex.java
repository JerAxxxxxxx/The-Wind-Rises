package com.windrises.system.arithmetic.array;


/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/5/8 10:38
 */
public class CenterIndex {
    /**
     * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
     * <p>
     * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
     * <p>
     * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1 = {2, 243, 43, 42, 32, 4, 4, 55, 6};
        //System.out.println(pivotIndex(arr1));

        int[] arr2 = {1, 7, 3, 6, 5, 6};
        //System.out.println(pivotIndex(arr2));

        int[] arr3 = {5, 2, 3, 3, 4};
        System.out.println(pivotIndex(arr3));

        int[] arr4 = {-1, -1, -1, 0, 1, 1};
        System.out.println(pivotIndex(arr4));
        System.out.println();
    }

    private static int pivotIndex(int[] nums) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            int right = 0;
            int left = 0;
            for (int j = i; j < nums.length; j++) {
                right += nums[j];
            }
            right = right - nums[i];
            for (int k = 0; k < i; k++) {
                left += nums[k];
            }
            if (left == right) {
                result = i;
                break;
            }
        }
        return result;
    }

    private static int pivotIndex2(int[] nums) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {

        }
        return result;
    }
}
