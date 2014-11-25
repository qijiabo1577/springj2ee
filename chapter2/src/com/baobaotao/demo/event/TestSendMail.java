package com.baobaotao.demo.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSendMail {
	public static void main(String[] args) {
		ApplicationContext aContext=new ClassPathXmlApplicationContext("com/baobaotao/demo/event/beans.xml");
		//从容器中获得邮件发送对象
		MailSender mSender=(MailSender) aContext.getBean("mailSender");
		mSender.sendMail("245695121@qq.com");
	}
}
