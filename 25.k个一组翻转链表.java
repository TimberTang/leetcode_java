/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] k个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int count = 1;
        ListNode dummp = new ListNode(0);
        dummp.next = head;
        while(head.next != null) {
            count ++;
            head = head.next;
        }
        k = k % count;

        

        return dummp.next;
    }
}

