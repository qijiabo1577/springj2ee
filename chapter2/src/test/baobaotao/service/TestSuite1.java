package test.baobaotao.service;

import test.baobaotao.superTest.SuperTest;
import test.baobaotao.superTest.TestFinder;

import com.baobaotao.domain.User;


public class TestSuite1 extends SuperTest{
	
	public TestSuite1(String method) {
		super(method);
	}

	
	public void testAdd(){
		assertEquals(2,1+1);
	}
	
	public void testSub(){
		assertEquals(0,1-1);
	}
	
	public void testUserDao(){
		User user=userDao.findUserByUserName("admin");
		assertEquals(user.getUserId(),"4028810145ee3acf0145ee4390eb0004");
	}
	
	public static void main(String[] args){
		TestFinder.run(TestSuite2.class, args);
		TestFinder.run(TestUserService_superTest.class, new String[]{"testHasMatchUser"});
		TestFinder.run(TestUserService.class,  new String[]{"hasMatchUser"});
	}
}
