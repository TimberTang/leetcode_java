/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int length = 1;
        ListNode trail = head;
        while (trail.next != null) {
            length ++;
            trail = trail.next;
        }

        k = length - (k % length);
        trail.next = head;
        while (k > 0) { 
            trail = trail.next;
            k --;
        }
        head = trail.next;
        trail.next = null; 

        return head;

    }
}

