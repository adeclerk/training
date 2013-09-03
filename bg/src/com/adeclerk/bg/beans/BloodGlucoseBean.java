package com.adeclerk.bg.beans;

import java.util.Date;

public class BloodGlucoseBean {
	private Date timestamp;
	private int value;
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
