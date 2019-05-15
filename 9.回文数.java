/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        return reverse(x) == x;
    } 
    
    public int reverse(int x) { 
        int head = 1;
        if (x < 0 ) {
            head = -1;
        }
        int result = 0; 
        x = Math.abs(x);
        while (x != 0) {  
            int pop = x % 10;
            if (result > (Integer.MAX_VALUE / 10) 
                || (result == (Integer.MAX_VALUE) && pop > 7)) {
                return 0;
            }   
            result = (result * 10) + (x % 10); 
            x = x / 10;
        }
        return result * head;
    } 
}

