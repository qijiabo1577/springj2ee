package test.baobaotao.service;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//»ùÓÚjunitµÄspring²âÊÔ¿ò¼Ü
@ContextConfiguration(locations={"/applicationContext.xml"})//Æô¶¯SpringÈÝÆ÷
public class TestUserService extends TestCase {
	@Autowired
	private UserService userService;
	
	@Test
	public void hasMatchUser(){
		boolean b1=userService.hasMatchUser("admin", "123456");
		boolean b2=userService.hasMatchUser("admin", "1111");
		assertTrue(b1);
		//assertTrue(b2);
	}
	
	@Test
	public void findUserByUserName(){
		User user=userService.findUserByUserName("admin");
		assertEquals(user.getUserName(), "admin");
	}
}
