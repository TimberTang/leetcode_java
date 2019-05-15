/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } 
        ListNode p = head, q = p.next, carry = q;
        while(q != null && q.next != null) {
            p.next = q.next;
            p = p.next;
            q.next = p.next;
            q = q.next;
        }
        p.next = carry;
        return head;
    }
}

