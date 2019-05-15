/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */
class Solution {
    public int[] twoSum(int[] nums, int target) { 
        if (nums.length < 2) {
            return new int[]{-1, -1};
        }
        for(int i = 0 , j = nums.length - 1; i < j; ) { 
            int sum = (nums[i] + nums[j]);
            if (sum == target) {
                return new int[]{i+1, j + 1};
            }else if (sum > target) {
                j --;
            }else {
                i ++;
            }
        }
        return new int[]{-1, -1};
    }
}

