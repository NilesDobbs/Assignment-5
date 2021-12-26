package com.assignmentFive;
import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Integer LengthofArray = 10;
	Object[] items = new Object[LengthofArray];
	Integer itemCounter = 0;
	
	public boolean add(T item) {
	
		if (getSize() == LengthofArray) {
			items = Arrays.copyOf(items, getSize() * 2);
		}
		items[itemCounter] = item;
		itemCounter++;
		return true;
		}

	public int getSize() {
		return itemCounter;
	}

	public T get(int index) {
		return (T) items [index];
	}
}