import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */
class Solution {
    public int singleNumber(int[] nums) {
       int result = 0;
       for (int num : nums) {
           result = result ^ num;
       }
       return result;
    }
}

