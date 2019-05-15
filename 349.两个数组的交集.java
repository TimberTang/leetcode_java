import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        } 
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {  
                res.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }

        int[] arr = new int[res.size()];
        for (int i= 0; i < res.size(); i++) { 
            arr[i] = res.get(i);
        }
        return arr;
    }
}

