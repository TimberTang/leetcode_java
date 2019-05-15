import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */
class Solution {
    public int singleNumber(int[] nums) {
        int resu = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int oldCount = map.get(nums[i]);
                map.put(nums[i], oldCount + 1);
            }else {
                map.put(nums[i], 1);
            }
        }

        for (int num : map.keySet()) {
            if(map.get(num) == 1) {
                return num;
            }
        }

        return resu;
    }
}

