package com.saraya.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.Size;

public class Todo {
	
	static int count = 0;
	//Counter count = new Counter();
	
	private int id;
	private String username;
	@Size(min=5, message="Please enter at least 10 characters")
	private String desc;
	private Date targetDate;
	private boolean isDone;
	
	public String formatDate() {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		return df.format(this.targetDate).toString();
	}
	
	public Todo() {
		
	}
	
	public Todo(String username, String desc, Date targetDate, boolean isDone) {
		super();
		this.id = ++count ;
		//this.id = count.increment();
		this.username = username ;
		this.desc = desc ;
		this.targetDate = targetDate ;
		this.isDone = isDone ;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", desc=" + desc + ", targetDate=" + targetDate
				+ ", isDone=" + isDone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return id == other.id;
	}
	
	
	
}
