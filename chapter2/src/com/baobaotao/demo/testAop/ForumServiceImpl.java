package com.baobaotao.demo.testAop;

public class ForumServiceImpl implements ForumService{

	public void removeTopic() {
		PerformanceMonitor.begin("com.baobaotao.demo.testAop.ForumServiceImpl.removeTopic");
		try {
			Thread.currentThread();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PerformanceMonitor.end();
	}

	public void removeForum() {
		try {
			Thread.currentThread();
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
