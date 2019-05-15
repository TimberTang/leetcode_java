/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 * 
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int max = 0; 
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            max = (max >= 0) ? (max + current) : current;
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}

