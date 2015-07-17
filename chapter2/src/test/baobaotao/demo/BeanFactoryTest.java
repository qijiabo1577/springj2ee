package test.baobaotao.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.baobaotao.reflect.Car;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	public static void main(String[] args) {
		ResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
		Resource res=resolver.getResource("classpath:com/baobaotao/demo/beanFactory/beans.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		Car car=bf.getBean("car1",Car.class);
		System.out.print("car.brand:"+car.getBrand());
	}
}
