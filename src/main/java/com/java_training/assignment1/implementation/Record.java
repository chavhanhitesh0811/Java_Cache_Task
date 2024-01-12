package com.java_training.assignment1.implementation;

public class Record {

	private String value;
	private int count;

	public Record(String value, int count) {
		super();
		this.value = value;
		this.count = count;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
