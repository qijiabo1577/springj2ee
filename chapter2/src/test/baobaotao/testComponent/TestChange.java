package test.baobaotao.testComponent;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChange {
	public static void main(String[] args) {
		//∂¡»°beanpe
		ApplicationContext ac=new ClassPathXmlApplicationContext("test/baobaotao/testComponent/beans.xml");
		TestComponent tc=ac.getBean(TestComponent.class);
		List<Plugin> oList=tc.getPlugins();
		for(Plugin ob:oList){
			System.out.println(ob.getName());
		}
	}
}