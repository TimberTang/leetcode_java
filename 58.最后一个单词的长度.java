/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */
class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0 ) {
            return 0;
        }
        int i = s.length() - 1; 
        int result = 0;
        while(i >= 0 && s.charAt(i) == ' ' ){ // 判断末尾是 ' '的字符, 将指针向前走
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){ // 当字符等于 ' ',长度 + 1 
            result++;
            i --;
        } 
        return result;
    }
}

