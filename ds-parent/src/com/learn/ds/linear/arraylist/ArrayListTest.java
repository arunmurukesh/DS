package com.learn.ds.linear.arraylist;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		System.out.println("Size of the arrayList is " + list.size());

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		list.print();
		System.out.println("Size of the arrayList is " + list.size());

		list.remove(30);
		list.print();
		System.out.println("Size of the arrayList is " + list.size());

		System.out.println("Contains 40 " + list.contains(40));
		System.out.println("Contains 100 " + list.contains(100));

		System.out.println("Position of 40 " + list.position(40));
		System.out.println("Position of 100 " + list.position(100));
		
	}

}
