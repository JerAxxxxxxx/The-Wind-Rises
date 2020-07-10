package com.windrises.system.arithmetic.array;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/5/8 14:54
 */
public class AddOne {
    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * <p>
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * <p>
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * <p>
     * 输入: [1,2,3]
     * 输出: [1,2,4]
     * 解释: 输入数组表示数字 123。
     * <p>
     * 输入: [4,3,2,1]
     * 输出: [4,3,2,2]
     * 解释: 输入数组表示数字 4321。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
    }

    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 0) {
            return new int[]{1};
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int length = digits.length;
        Integer zero = addZero(length);
        for (int i = 0; i < digits.length; i++) {
            int data = digits[i] * zero;
            sb.append(digits[0]);
        }
        return new int[]{};
    }


    private final static int[] SIZE_TABLE = {9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE};

    private int sizeOfInt(int x) {
        for (int i = 0; ; i++) {
            if (x <= SIZE_TABLE[i]) {
                return i + 1;
            }
        }
    }

    private Integer addZero(int number) {
        Integer zeros = 0;
        switch (number) {
            case 1: {
                zeros = 0;
                break;
            }
            case 2: {
                zeros = 10;
                break;
            }
            case 3: {
                zeros = 100;
                break;
            }
            case 4: {
                zeros = 1000;
                break;
            }
            case 5: {
                zeros = 10000;
                break;
            }
            default:
        }
        return zeros;
    }
}
