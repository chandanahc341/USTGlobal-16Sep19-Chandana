package com.ustglobal.mailapp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="Mail_info")
public class MailBean {

	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String subject;
	@Column
	private String message;
	@Column
	private String status; 
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "From_id",nullable = false)
	private UserBean userBeanFid;
   @JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="To_id", nullable = false)
	private UserBean userBeanTid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public UserBean getUserBeanFid() {
	return userBeanFid;
}
public void setUserBeanFid(UserBean userBeanFid) {
	this.userBeanFid = userBeanFid;
}
public UserBean getUserBeanTid() {
	return userBeanTid;
}
public void setUserBeanTid(UserBean userBeanTid) {
	this.userBeanTid = userBeanTid;
}

   
}
