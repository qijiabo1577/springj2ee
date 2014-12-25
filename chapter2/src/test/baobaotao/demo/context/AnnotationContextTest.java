package test.baobaotao.demo.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.baobaotao.reflect.Car;

public class AnnotationContextTest {
	public static void main(String[] args) {
		//ͨ��һ��pojoװ��bean����
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanContext.class);
		Car car=(Car) context.getBean("car",Car.class);
		System.out.print(car.getBrand());
	}
}
