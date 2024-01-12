package com.java_training.assignment1.LinkedListImplementation;

import java.util.Objects;

public class Record {

	private String key;
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Record(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

//	override and change equals function to compare on key of the record
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Record other = (Record) obj;
		return Objects.equals(key, other.key);
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}
}

//&& Objects.equals(value, other.value)