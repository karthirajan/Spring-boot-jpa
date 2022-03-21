package com.app.webservices.users.userApp;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserBean {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String designation;
	
	private Date targetDate;
	
	private boolean status;
	
	public UserBean() {
		
	}

	public UserBean(long id, String name, String designation, Date date, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.targetDate = date;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDate() {
		return targetDate;
	}

	public void setDate(Date date) {
		this.targetDate = date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", designation=" + designation + ", date=" + targetDate + ", status="
				+ status + "]";
	}

	
	
	
	
	

}
