package com.baobaotao.demo.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.baobaotao.reflect.Car;

public class AnnotationContextTest {
	public static void main(String[] args) {
		//通过一个pojo装载bean配置
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanContext.class);
		Car car=(Car) context.getBean("car",Car.class);
		System.out.print(car.getBrand());
	}
}
