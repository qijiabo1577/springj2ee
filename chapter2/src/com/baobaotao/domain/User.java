package com.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private int userId;//用户Id
	private String userName;//用户名
	private String password;//密码
	private int credits;//身份证号
	private String lastIp;//上次登录ip
	private Date lastVisit;//上次登录日期
	
	
	//-------------------------------------
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
}
