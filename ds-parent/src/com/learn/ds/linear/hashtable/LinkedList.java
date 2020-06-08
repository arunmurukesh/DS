package com.learn.ds.linear.hashtable;

import java.util.StringJoiner;

public class LinkedList {

	private Node head;

	public void add(String key, String value) {

		Node current = new Node(key, value);

		if (head == null) {
			head = current;
			return;
		}

		getTail().next = current;
	}

	public boolean contains(String key) {

		Node tail = head;
		while (tail != null) {
			if (tail.key.equalsIgnoreCase(key))
				return true;
			tail = tail.next;
		}

		return false;
	}

	public String get(String key) {

		Node tail = head;
		while (tail != null) {
			if (tail.key.equalsIgnoreCase(key))
				return tail.value;
			tail = tail.next;
		}

		return null;
	}

	public boolean remove(String key) {

		Node tail = head;
		Node previous = null;
		while (tail != null) {

			if (tail.key.equalsIgnoreCase(key)) {
				if (previous == null)
					head = null;
				else
					previous.next = tail.next;
				System.out.println("\n" + key + " is Removed ");
				return true;
			}

			previous = tail;
			tail = tail.next;
		}

		System.out.println("\n" + key + " is Not found ");
		return false;
	}

	private Node getTail() {
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}

	public String toString() {
		Node tail = head;
		StringJoiner builder = new StringJoiner(",", "[", "]");

		while (tail != null) {
			builder.add(tail.key + ":" + tail.value);
			tail = tail.next;
		}

		return builder.toString();
	}

}
