package test.baobaotao.demo.event;

import org.springframework.context.ApplicationListener;

public class MailSendListener implements ApplicationListener<MailSendEvent>{

	public void onApplicationEvent(MailSendEvent mse) {
		MailSendEvent event=(MailSendEvent) mse;
		System.out.println("MailSendEvent��"+event.getTo()+"������һ��Email��");
	}
}
