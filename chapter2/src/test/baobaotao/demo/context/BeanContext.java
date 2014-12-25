package test.baobaotao.demo.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baobaotao.reflect.Car;

/**
 * ��java��ķ�ʽ����javabean
 * 
 * @author Administrator
 *
 */
@Configuration
public class BeanContext {
	/**
	 * ����һ��car����
	 * @return
	 */
	@Bean(name="car")
	public Car buildCar(){
		Car car=new Car();
		car.setBrand("����");
		car.setColor("��ɫ");
		car.setMaxSpeed(200);
		return car;
	}
}
