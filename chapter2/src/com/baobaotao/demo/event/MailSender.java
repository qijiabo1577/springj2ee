package com.baobaotao.demo.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.event.ApplicationContextEvent;

public class MailSender implements ApplicationContextAware{
	private ApplicationContext ctx;
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx=ctx;
	}
	
	public void sendMail(String to){
		System.out.println("模拟发送一个Mail~");
		MailSendEvent mse=new MailSendEvent(this.ctx,to);
		//向容器中所有监听器发送事件
		ctx.publishEvent(mse);
	}
}
