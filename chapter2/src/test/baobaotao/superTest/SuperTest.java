package test.baobaotao.superTest;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;

public class SuperTest extends TestCase{
	/**
	 * 加载spring配置文件，用来获取对象  
	 * 通过beanFactory启动Ioc容器时不会初始化对象，
	 * 初始化对象只发生在第一次调用时
	 */
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
	 * 构造方法  用于TestFinder  找到具体的测试用例
	 */
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
