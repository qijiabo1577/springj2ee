package api.first.model;

import org.springframework.util.StringUtils;

public class SysUser {
	private String id;
	private String userName;
	private String phoneNum;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return StringUtils.isEmpty(userName)?"":userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNum() {
		return StringUtils.isEmpty(phoneNum)?"":userName;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
