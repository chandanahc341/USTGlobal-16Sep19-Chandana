package com.ustglobal.mailapp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.build.ToStringPlugin.Exclude;



@Entity
@Table(name ="User_info")
public class UserBean {
    @Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String user_name;
	@Column
	private String email;
	@Column
	private String password;

	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "userBeanFid")
	private List<MailBean> mailBeans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<MailBean> getMailBeans() {
		return mailBeans;
	}

	public void setMailBeans(List<MailBean> mailBeans) {
		this.mailBeans = mailBeans;
	}

}



