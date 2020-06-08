package com.learn.ds.linear.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		ll.print();

		ll.remove(100);
		ll.search(60);
		
		System.out.println("Is 60 present " + ll.search(60));
		ll.print();
		
		
	}

}
