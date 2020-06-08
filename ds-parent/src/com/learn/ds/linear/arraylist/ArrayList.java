package com.learn.ds.linear.arraylist;


public class ArrayList {

	private Integer[] content = null;
	private int MAX_COUNT = 5;
	private int size = MAX_COUNT;
	private int currentIndex = 0;

	public ArrayList() {
		content = new Integer[MAX_COUNT];
	}

	public void add(int data) {

		if (currentIndex == MAX_COUNT)
			copy();

		content[currentIndex] = data;
		currentIndex++;
	}

	public void remove(int data) {

		for (int i = 0; i < currentIndex; i++) {
			if (content[i] == data)
				content[i] = null;
		}

	}

	public boolean contains(int data) {

		for (int i = 0; i < currentIndex; i++) {
			if (content[i] !=null && content[i] == data)
				return true;
		}

		return false;
	}

	public Integer position(int data) {

		for (int i = 0; i < currentIndex; i++) {
			if (content[i] !=null && content[i] == data)
				return i;
		}

		return null;
	}

	public Integer get(int index) {

		if (index < currentIndex)
			return content[currentIndex];

		return null;
	}

	public int size() {
		return currentIndex;
	}

	public void print() {

		for (int i = 0; i < currentIndex; i++) {
			System.out.print(content[i] + " ");
		}
	}

	private void copy() {
		size = MAX_COUNT * 2;
		Integer[] tempContent = new Integer[size];

		for (int i = 0; i < currentIndex; i++) {
			tempContent[i] = content[i];
		}
		content = tempContent;
	}
}
