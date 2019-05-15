/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int trail = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i];
            int sum = temp + trail;
            if (sum >= 10) {
                trail = 1;
            } else {
                trail = 0;
            }
            digits[i] = sum % 10;
        } 
        if (trail > 0) {
            int array[] = new int[digits.length + 1];
            array[0] = trail;
            for (int i = 1; i < array.length; i++) {
                array[i] = digits[i - 1];
            }
            return array;
        }
        return digits;
    }
}

