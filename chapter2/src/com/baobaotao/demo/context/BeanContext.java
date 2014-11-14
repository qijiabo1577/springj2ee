package com.baobaotao.demo.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baobaotao.reflect.Car;

/**
 * 以java类的方式定义javabean
 * 
 * @author Administrator
 *
 */
@Configuration
public class BeanContext {
	/**
	 * 定义一个car对象
	 * @return
	 */
	@Bean(name="car")
	public Car buildCar(){
		Car car=new Car();
		car.setBrand("宝马");
		car.setColor("红色");
		car.setMaxSpeed(200);
		return car;
	}
}
