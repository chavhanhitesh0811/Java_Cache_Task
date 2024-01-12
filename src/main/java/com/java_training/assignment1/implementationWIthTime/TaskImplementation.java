package com.java_training.assignment1.implementationWIthTime;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.java_training.assignment1.implementationWIthTime.Record;

public class TaskImplementation {
	HashMap<String, Record> cache = new HashMap<>();

	public void put(String key, String value) {

		if (cache.size() == 10 && !cache.containsKey(key)) {
			String minimumVisitedKey = "";
			LocalDateTime minimumVisitedDate = LocalDateTime.now();
			for (String keyValue : cache.keySet()) {
				LocalDateTime visitedDate = cache.get(keyValue).getDate();
				if (visitedDate.isBefore(minimumVisitedDate)) {
					minimumVisitedDate = visitedDate;
					minimumVisitedKey = keyValue;
				}
			}
			cache.remove(minimumVisitedKey);
		}

		cache.put(key, new Record(value, LocalDateTime.now()));
	}

	public String get(String key) {
		if (!cache.containsKey(key)) {
			return "Please enter a valid key.";
		} else {
			cache.get(key).setDate(LocalDateTime.now());
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