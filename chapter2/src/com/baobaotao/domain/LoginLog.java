package com.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable{
	private static final long serialVersionUID = 1L;
	private String loginLogId;
	private String userId;//用户Id
	private String ip;//ip
	private Date loginDate;//登录日期
	
	
	
	//------------------------------------------
	
	public String getLoginLogId() {
		return loginLogId;
	}
	public void setLoginLogId(String loginLogId) {
		this.loginLogId = loginLogId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	

}
