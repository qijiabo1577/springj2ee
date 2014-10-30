package com.baobaotao.service;

import com.baobaotao.domain.User;

public interface UserService2 {
	public boolean hasMatchUser(String userName,String password);
	
	public User findUserByUserName(String userName);
	
	//登录成功执行操作
	public void loginSuccess(User user );
}
