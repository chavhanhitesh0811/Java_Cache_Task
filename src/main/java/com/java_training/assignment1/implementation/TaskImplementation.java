package com.java_training.assignment1.implementation;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TaskImplementation {

	HashMap<String, Record> cache = new LinkedHashMap<>();

	public void put(String key, String value) {

		if (cache.size() == 10) {
			String minimumVisitedKey = "";
			int minimumVisitedCount = Integer.MAX_VALUE;
			for (String keyValue : cache.keySet()) {
				int visitedCount = cache.get(keyValue).getCount();
				if (visitedCount < minimumVisitedCount) {
					minimumVisitedCount = visitedCount;
					minimumVisitedKey = keyValue;
				}
			}
			cache.remove(minimumVisitedKey);
		}

		cache.put(key, new Record(value, 0));
	}

	public String get(String key) {
		if (!cache.containsKey(key)) {
			return "Please enter a valid key.";
		} else {
			cache.get(key).setCount(cache.get(key).getCount() + 1);
			return cache.get(key).getValue();
		}
	}

	public void showRecord() {
		int count = 0;
		for (String key : cache.keySet()) {
			System.out.println("Key = " + key + " value = " + cache.get(key).getValue());
			count++;
		}
		if (count == 0) {
			System.out.println("No record found.");
		}
	}
}
