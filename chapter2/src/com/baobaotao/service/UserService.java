package com.baobaotao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;

@Service //将UserService注释为服务层Bean
public interface UserService {
	public boolean hasMatchUser(String userName,String password);
	
	public User findUserByUserName(String userName);
	
	//登录成功执行操作
	public void loginSuccess(User user );
}
