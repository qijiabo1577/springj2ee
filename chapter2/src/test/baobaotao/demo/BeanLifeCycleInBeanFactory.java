package test.baobaotao.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class BeanLifeCycleInBeanFactory {
	public static void main(String[] args) {
		Resource res =new ClassPathResource("com/baobaotao/beanFactory/bean.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		
	}
	
	
}
