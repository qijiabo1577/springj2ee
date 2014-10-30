package test.baobaotao.service;

import java.util.Date;
import com.baobaotao.domain.User;
import com.baobaotao.service.UserService2;

import test.baobaotao.superTest.SuperTest;

public class TestUserService_superTest extends SuperTest {
	
	public TestUserService_superTest(String method) {
		super(method);
	}
	
	protected UserService2 userService=(UserService2) getEntity("userService");
	
	public void testHasMatchUser(){
		boolean b1=userService.hasMatchUser("admin", "123456");
		boolean b2=userService.hasMatchUser("admin", "1111");
		assertTrue(b1);
		//assertTrue(b2);
	}
	
	public void testFindUserByUserName(){
		User user=userService.findUserByUserName("admin");
		assertEquals(user.getUserName(), "admin");
	}
	
	public void testLoginSuccess(){
		User user=userService.findUserByUserName("admin");
		user.setLastVisit(new Date());
		user.setLastIp("11.11.11.11");
		userService.loginSuccess(user);
	}
	
	
}
