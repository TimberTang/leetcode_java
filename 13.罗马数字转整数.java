/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */
class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0 ) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int i = 0;
        for (; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char last = s.charAt(i + 1);
            if (map.get(ch) >= map.get(last)) {
                result += map.get(ch);
            }else {
                result += map.get(last) - map.get(ch);
                i ++;
            }
        }
        if (i < s.length()) {
            char last = s.charAt(s.length() - 1);
            result += map.get(last);
        }
        return result;
    }
}

