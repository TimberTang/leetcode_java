import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */
class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) return false; 
        HashMap<Integer, Integer> map = new HashMap<>(); 
        map.put(n, n);
        while (n != 1) {
            int result = 0;
            while(n > 0 ) {
                result += Math.pow(n % 10, 2);
                n = n/ 10;     
            }
            if (map.containsKey(result)) {
                return false;
            }
            map.put(result, result);
            n = result;
        }
        return true;
    } 

}


