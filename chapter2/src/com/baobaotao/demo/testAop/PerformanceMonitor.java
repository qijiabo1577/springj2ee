package com.baobaotao.demo.testAop;


public class PerformanceMonitor {
	private static ThreadLocal<MethodPerformance> performaceRecord=
		new ThreadLocal<MethodPerformance>(); 
	
	public static void begin(String method){
		MethodPerformance mPerformance=new MethodPerformance(method);
		performaceRecord.set(mPerformance);
	}
	
	public static void end(){
		MethodPerformance methodPerformance=performaceRecord.get();
		methodPerformance.printPerformance();
	}
}
