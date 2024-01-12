package com.java_training.assignment1.LinkedListImplementation;

import java.util.LinkedList;

public class TaskImplementation {

	LinkedList<Record> list = new LinkedList<>();

	public void put(String key, String value) {

//		creating new record with key & value
		Record record = new Record(key, value);

		if (list.size() == 10) {
//			Here we only matched a key of the record not a complete record i.e(key & value)
//			overridden and change the equals method of object in Record.java
			if (!list.contains(record)) {
				list.removeLast();
			} else {
//				deleting the element with this key only & not value (deletion is based only on key)
				list.remove(record);
			}

			list.addFirst(record);

		} else {
//			Here we only matched a key of the record not a complete record i.e(key & value)
//			overridden and change the equals method of object in Record.java
			if (list.contains(record)) {
				list.remove(record);
			}
			list.addFirst(record);
		}
	}

	public String get(String key) {
//		created dummy record to check whether the object with this key is present in LinkedList or not.
		Record record = new Record(key, "");

//		Retrieved the index of that key and fetched the record object from list using get method
		int index = list.indexOf(record);
		Record result = list.get(index);
		String associatedValue = result.getValue();

		if (list.contains(record)) {
//			removed this element and add it to the last of list (shifting of record)
			list.remove(record);
			list.addFirst(new Record(key, associatedValue));
		} else {
			return "Invalid key.";
		}
		return associatedValue;
	}

	public void showRecord() {
		for (Record record : list) {
			System.out.println("Key = " + record.getKey() + " , value = " + record.getValue());
		}
	}
}
