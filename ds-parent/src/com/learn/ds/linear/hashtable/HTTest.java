package com.learn.ds.linear.hashtable;

public class HTTest {

	public static void main(String[] args) {
		
		HT hashTable = new HT();
		
		hashTable.add("1", "one");
		hashTable.add("2", "two");
		hashTable.add("3", "three");
		hashTable.add("4", "four");
		hashTable.add("5", "five");
		hashTable.add("6", "six");
		hashTable.add("7", "seven");
		hashTable.add("8", "eight");
		hashTable.add("9", "nine");
		hashTable.add("10", "ten");
		
		hashTable.print();
		
		System.out.println("Contain 6" + hashTable.contains("6"));
		System.out.println("Contain 26" + hashTable.contains("26"));

		
		System.out.println("Get 10" + hashTable.get("6"));
		System.out.println("get 11" + hashTable.get("11"));

		
		hashTable.remove("10");
		
		hashTable.print();
	}

}
