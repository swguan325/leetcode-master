package com.swguan.work;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 * author: swGuan
 * 1. plusVal: the value >= 10, will be plus into the next val
 * 2. putVal: the value < 10, will be plus into the current val
 * 
 */
public class Solution2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp = new ListNode(0);
		ListNode output = temp;

		int plusVal = 0, putVal = 0, result = 0;
		while (true) {
			result = l1.val + l2.val + plusVal;

			plusVal = (result) / 10;
			putVal = (result) % 10;
			temp.val = putVal;
			if (l1.next == null && l2.next == null) {
				if (plusVal > 0)
					temp.next = new ListNode(plusVal);
				break;
			}

			if (l1.next != null) {
				l1 = l1.next;
			} else {
				l1.val = 0;
			}
			if (l2.next != null) {
				l2 = l2.next;
			} else {
				l2.val = 0;
			}
			temp.next = new ListNode(0);
			temp = temp.next;
		}
		return output;
	}

}
