package com.learn.ds.linear.linkedlist;

public class LinkedList {

	private Node head;

	public void add(int data) {

		Node current = new Node(data);

		if (head == null) {
			head = current;
			return;
		}

		getTail().next = current;
	}

	public boolean search(int data) {

		Node tail = head;
		while (tail != null) {
			if (tail.data == data) {
				return true;
			}
			tail = tail.next;
		}

		return false;
	}

	public boolean remove(int data) {

		Node tail = head;
		Node previous = null;
		while (tail != null) {

			if (tail.data == data) {

				if (previous == null)
					head = null; // When the Linked List has only single node
				else
					previous.next = tail.next;

				System.out.println("\n" + data + " is removed");
				return true;
			}
			previous = tail;
			tail = tail.next;

		}

		System.out.println("\n" + data + " is Not found ");
		return false;
	}

	private Node getTail() {
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}

	public void print() {

		Node tail = head;
		while (tail != null) {
			System.out.print(tail.data + " ");
			tail = tail.next;
		}
	}

}
