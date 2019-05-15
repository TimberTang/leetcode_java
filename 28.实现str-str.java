/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现strStr()
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int hayLength = haystack.length();
        int nLength = needle.length();
        int index = -1;
        for (int i = 0; i < hayLength - nLength + 1; i++) { 
            String sub = haystack.substring(i, i + nLength);
            if (sub.equals(needle)) {
                return i;
            }
        }
        
        return index;
    } 

}

