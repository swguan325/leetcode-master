package com.swguan.work;

import java.util.HashMap;

/**
 * 
 * 1. Neweast node will link to the tail node
 * 2. Each time get the node, remove the node first, and treat as neweast(go to 1)
 * 3. Once capacity if full, remove the head node
 * 
 */
public class Solution146 {

	public static void main(String args[]) {
		LRUCache cache = new LRUCache(3);
		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1);
		cache.put(3, 3);
		cache.get(2);
		cache.put(4, 4);
		cache.get(1);
		cache.get(3);
		cache.get(4);
	}
}

class Node {
	int key, val;
	Node prev, next;

	public Node(int key, int val) {
		this.key = key;
		this.val = val;
	}
}

class LRUCache {

	Node head;
	Node tail;
	HashMap<Integer, Node> map = null;
	int capacity = 0;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<>();
	}

	public int get(int key) {
		if (map.get(key) == null) {
			return -1;
		}
		Node t = map.get(key);
		removeNode(t);
		putNode(t);
		return t.val;
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			Node t = map.get(key);
			t.val = value;

			removeNode(t);
			putNode(t);
		} else {
			if (map.size() >= capacity) {
				map.remove(head.key);
				removeNode(head);
			}

			Node node = new Node(key, value);
			putNode(node);
			map.put(key, node);
		}
	}

	private void removeNode(Node n) {
		if (n.prev != null) {
			n.prev.next = n.next;
		} else {
			head = n.next;
		}

		if (n.next != null) {
			n.next.prev = n.prev;
		} else {
			tail = n.prev;
		}
	}

	private void putNode(Node n) {
		if (tail != null) {
			tail.next = n;
		}

		n.prev = tail;
		n.next = null;
		tail = n;

		if (head == null) {
			head = tail;
		}
	}

}