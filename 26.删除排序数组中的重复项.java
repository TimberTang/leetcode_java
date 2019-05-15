/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */
class Solution {
    public int removeDuplicates(int[] nums) { 
        int pre = 0;
        // 利用两个指针循环比较 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[pre]) { 
                pre ++;
                nums[pre] = nums[i];
            } 
        }

        return pre + 1;
    }
}

