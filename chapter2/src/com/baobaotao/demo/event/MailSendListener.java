package com.baobaotao.demo.event;

import org.springframework.context.ApplicationListener;

public class MailSendListener implements ApplicationListener<MailSendEvent>{

	public void onApplicationEvent(MailSendEvent mse) {
		MailSendEvent event=(MailSendEvent) mse;
		System.out.println("MailSendEvent向："+event.getTo()+"发送完一封Email！");
	}
}
