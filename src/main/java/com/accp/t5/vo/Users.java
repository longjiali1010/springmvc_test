package com.accp.t5.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//jaxb框架
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

//jaxb
@XmlRootElement(name = "users")
public class Users {

	private Integer userId;

	private String userName;

	private String userPwd;

	private Date userDate=new Date();
	
	private List<String> roles = new ArrayList<String>();

	@XmlElement(name = "uid")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@XmlElement(name = "uname")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@XmlElement(name = "upwd")
	public String getUserPwd() {
		return userPwd;
	}

	
	@XmlElement(name = "udate")
	public Date getUserDate() {
		return userDate;
	}

	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}

	@XmlElementWrapper(name = "roles")
	@XmlElement(name = "rolename")
	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Users(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}

	public Users() {
		super();
	}

	public Users(Integer userId, String userName, String userPwd) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
	}

}
