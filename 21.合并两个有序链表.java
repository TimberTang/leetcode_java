/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       
        ListNode dummyHead = new ListNode(0);
        ListNode resu = dummyHead; 
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                resu.next = l1;
                resu = resu.next;
                l1 = l1.next;
            }else {
                resu.next = l2;
                resu = resu.next;
                l2 = l2.next;
            } 
        }
        if (l1 != null) {
            resu.next = l1;
        }
        if (l2 != null) {
            resu.next = l2;
        }
        return dummyHead.next;
    }
}

