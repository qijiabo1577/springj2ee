package com.baobaotao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {
	public static Car initByDefaultConst() throws Exception{
		//通过类装载器 获取Car类对象
		ClassLoader loader=Thread.currentThread().getContextClassLoader();
		Class clazz=loader.loadClass("com.baobaotao.reflect.Car");
		
		//获取类的默认构造器 并实例化
		Constructor con=
			clazz.getDeclaredConstructor((Class[])null);
		Car car=(Car) con.newInstance();
		
		//通过反射方法设置属性
		Method setBrand=clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "红旗");
		Method setColor=clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "黑色");
		Method setMaxSpeed=clazz.getMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 200);
		return car;
	}
	
	public static void main(String[] args) throws Exception{
		Car car=initByDefaultConst();
		car.introduce();
	}
}
