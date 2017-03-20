package com.besoft.Restful.Messenger.model;

import java.util.Date;

public class Comments {
private long id;
private String author;
private Date created;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}

}
