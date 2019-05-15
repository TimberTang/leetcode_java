/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode r = head;
        for (int i = 1; i < n; i++) {
            r = r.next;
        }
        ListNode l = dummyHead;
        while (r.next != null) {
            l = l.next;
            r = r.next;
        }
        l.next = l.next.next;
        return dummyHead.next;
    }
}

