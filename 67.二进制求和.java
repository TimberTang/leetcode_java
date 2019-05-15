/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */
class Solution {
    public String addBinary(String a, String b) { 
        int i = a.length()-1,j = b.length()-1;
        int carry = 0,sum = 0;
        String result = "";
        for(;i >= 0 || j >= 0; i--,j--){
            sum = 0;
            if(i >= 0){
                sum = sum + (int)(a.charAt(i) - '0');
            }
            if(j >= 0){
                sum = sum + (int)(b.charAt(j) - '0');
            }
            sum = sum + carry;
            carry = 0;
            if(sum >= 2){
                carry = sum / 2;
                sum = sum % 2;
            }
            result = sum + result;
        }
        
        if(carry > 0){
            result = carry + result;
        }
        return result; 
    }
}

