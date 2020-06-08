package com.learn.ds.linear.hashtable;

import java.util.StringJoiner;

public class HT {

	LinkedList[] content;
	private int MAX_COUNT = 10;
	private int size = MAX_COUNT;

	public HT() {
		content = new LinkedList[size];
	}

	public void add(String key, String value) {

		int index = index(key);

		System.out.println("Index of key : " + key + " is : " + index);
		if (content[index] == null) {
			LinkedList entry = new LinkedList();
			entry.add(key, value);
			content[index] = entry;
		} else {
			content[index].add(key, value);
		}

	}

	private int index(String key) {

		return key.hashCode() % MAX_COUNT;
	}

	public void print() {

		StringJoiner joiner = new StringJoiner(",", "{", "}");
		for (int i = 0; i < size; i++) {

			if (content[i] == null)
				continue;

			joiner.add(content[i].toString());
		}

		System.out.println(joiner.toString());
	}

	public boolean contains(String key) {
		
		int index = index(key);
		
		if(content[index] == null)
			return false;
		
		
		return content[index].contains(key);
	}

	public String get(String key) {

		int index = index(key);
		
		if(content[index] == null)
			return null;
		
		
		return content[index].get(key);
			
	}
	
	public boolean remove(String key) {

		int index = index(key);
		
		if(content[index] == null)
			return false;
		
		
		return content[index].remove(key);
			
	}
}
