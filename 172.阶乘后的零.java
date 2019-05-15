/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */
class Solution {
    public int trailingZeroes(int n) { 
        int resu = 0;
        if (n == 0) {
            return 0;
        }
        while (n > 0) {
            resu = resu + (n / 5);
            n = n / 5;
        }
        return resu;
    }
}

