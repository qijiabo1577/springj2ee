package test.baobaotao.superTest;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.service.UserService;

public class SuperTest extends TestCase{
	private BeanFactory beanFactory;
	
	protected  Object getEntity(String daoName) {  
		beanFactory = new ClassPathXmlApplicationContext("/applicationContext.xml");  
		return beanFactory.getBean(daoName);  
	} 
	
	/**
	 * 用户dao
	 */
	protected UserDao userDao=(UserDao) getEntity("userDao");
	
	/**
	 * 登录系统dao
	 */
	protected LoginLogDao loginLogDao=(LoginLogDao) getEntity("loginLogDao");
	
	/**
	 * userService
	 * @param method
	 */
	
	protected UserService userService=(UserService) getEntity("userService");
	public SuperTest (String method){
		super(method);
	}
	
	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}
}
