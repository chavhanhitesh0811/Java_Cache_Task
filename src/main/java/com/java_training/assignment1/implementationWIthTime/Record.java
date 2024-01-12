package com.java_training.assignment1.implementationWIthTime;

import java.time.LocalDateTime;

public class Record {

	private String value;
	private LocalDateTime date;

	public Record(String value, LocalDateTime date) {
		super();
		this.value = value;
		this.date = date;
	}

	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
