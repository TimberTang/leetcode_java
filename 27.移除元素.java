/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int pre = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[pre] == val) {
                nums[pre] = nums[i];
                pre ++;
            }
        }
        return pre + 1;
    }
}

