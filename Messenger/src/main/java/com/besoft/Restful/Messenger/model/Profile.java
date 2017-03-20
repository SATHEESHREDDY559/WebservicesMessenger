package com.besoft.Restful.Messenger.model;

import java.util.Date;

public class Profile {
	private long id;
	private String Fname;
	private String Lname;
	private Date created;
	public Profile() {
		// TODO Auto-generated constructor stub
	}
	
	public Profile(long id, String fname, String lname, Date created) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.created = created;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", created=" + created + "]";
	}
	

}
