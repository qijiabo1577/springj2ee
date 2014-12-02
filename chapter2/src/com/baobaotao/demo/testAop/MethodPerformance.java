package com.baobaotao.demo.testAop;

public class MethodPerformance {
	private long begin;
	private long end;
	private String serviceMethod;
	
	public MethodPerformance(String serviceMethod){
		this.serviceMethod=serviceMethod;
		this.begin=System.currentTimeMillis();
	}
	public void printPerformance(){
		end=System.currentTimeMillis();
		long takes=end-begin;
		System.out.println(serviceMethod+"ª®∑—¡À:"+takes+"∫¡√Î£°");
	}
}
