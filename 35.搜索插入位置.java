/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp == target) {
                return i;
            }else if(target < temp) {  
                return i;
            } 
        }
        if (target > nums[nums.length - 1]) {
            result = nums.length;
        }
        return result;
    }
}

