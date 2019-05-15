/*
 * @lc app=leetcode.cn id=201 lang=java
 *
 * [201] 数字范围按位与
 */
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int d = Integer.MAX_VALUE;
        while ( (m & d) != (n & d)) {
            d = d << 1;
        }
        return m & d;
    }
}

