package com.saraya.form;

import java.util.Date;
import java.util.Objects;

public class Todo {
	
	static int count = 0;
	
	private int id;
	private String username;
	private String desc;
	private Date targetDate;
	private boolean isDone;
	
	public Todo(String username, String desc, Date targetDate, boolean isDone) {
		super();
		this.id = ++count ;
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
