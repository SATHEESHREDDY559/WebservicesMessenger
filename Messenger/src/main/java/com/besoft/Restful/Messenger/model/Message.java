package com.besoft.Restful.Messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {
private long id;
private String message;
private Date date;
private String author;


public Message() {
	// TODO Auto-generated constructor stub
}
public Message(long id, String message, Date date, String author) {
	super();
	this.id = id;
	this.message = message;
	this.date = date;
	this.author = author;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Message [id=" + id + ", message=" + message + ", date=" + date + ", author=" + author + "]";
}

}
