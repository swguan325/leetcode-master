package com.swguan.work;

/** 
 * author: swGuan
 * 1. add a node before head, such as 0
 * 2. ex: swap 1 =>  2 => 3 => 4
 * 3. the next of 1 is 3, the next of 2 is 1, so the next of 0 is 1
 * 4. after swap, the pointer move twice 
 * 
 */
public class Solution24 {
	
    public ListNode swapPairs(ListNode head) {
    	if (head == null || head.next == null) {
    		return head;
    	}
    	ListNode tHead = new ListNode(0);
    	tHead.next = head;
    	ListNode pre = tHead;
        while (pre.next != null && pre.next.next != null) {
        	ListNode headNode = pre.next;
        	ListNode nextNode = pre.next.next;
        	
        	headNode.next = headNode.next.next;
        	nextNode.next = headNode;
        	pre.next = nextNode;
        	
        	pre = pre.next.next;
        }
    	return tHead.next;
    }
	
}
