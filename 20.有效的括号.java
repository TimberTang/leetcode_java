/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */
class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ('(')) {
                stack.push(')');
            }else if (ch == ('[')) {
                stack.push(']');
            }else if (ch == ('{')) {
                stack.push('}');
            }else {
                if (stack.empty() || !stack.pop().equals(ch)) {
                    return false;
                }
            }
            
        }
        return stack.empty();
    }
}

