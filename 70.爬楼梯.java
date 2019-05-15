/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */
class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[n + 1]; 
        steps[0] = 1;  
        steps[1] = 2; 
        int index = 2;
        while (index < n) {
            steps[index] = steps[index - 1] + steps[index - 2];
            index ++;
        }
        return steps[n - 1];
    }
}

