package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. get the size of ListNode
 * 2. mod == 0 return directly, mod != 0 => rotate
 * 
 */
public class Solution61 {

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null) return head;
		ListNode temp = head;
		// 先得到數字
		int size = 1;
		while (temp.next != null) {
			temp = temp.next;
			size++;
		}
		int mod = k % size;
		if (mod == 0) {
			return head;
		} else {
			for (int i = 0; i < mod; i++) {
				head = rotateList(head, temp);
			}
		}
		return head;
	}

	public ListNode rotateList(ListNode head, ListNode newHead) {
		ListNode temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		newHead = temp.next;
		temp.next = null;
		newHead.next = head;
		return newHead;
	}

}
