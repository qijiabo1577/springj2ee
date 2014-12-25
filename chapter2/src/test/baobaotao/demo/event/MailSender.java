package test.baobaotao.demo.event;

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
		System.out.println("ģ�ⷢ��һ��Mail~");
		MailSendEvent mse=new MailSendEvent(this.ctx,to);
		//�����������м����������¼�
		ctx.publishEvent(mse);
	}
}
