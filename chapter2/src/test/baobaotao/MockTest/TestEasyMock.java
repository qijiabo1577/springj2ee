package test.baobaotao.MockTest;

import org.easymock.MockControl;

import com.baobaotao.domain.User;
import com.baobaotao.service.UserService2;

import test.baobaotao.superTest.SuperTest;

public class TestEasyMock extends SuperTest{

	public TestEasyMock(String method) {
		super(method);
	}
	
	private UserService2 mockuserService;
	private MockControl userService_con;
	
	public void setUp(){
		userService_con=MockControl.createControl(UserService2.class);
		mockuserService=(UserService2) userService_con.getMock();
	}
	
	/**
	 * 使用easymock进行测试
	 */
	public void testUserServiceInEasyMock(){
		
		User tmpUser=new User();
		tmpUser.setUserName("admin");
		String admin="admin";
		//先调用需要mock的方法
		mockuserService.findUserByUserName(admin);
		//设置返回值
		userService_con.setReturnValue(tmpUser);
		//将mock切换到replay状态
		userService_con.replay();
		
		User user=mockuserService.findUserByUserName(admin);
		assertEquals(user.getUserName(),"admin");
	}
}
