package test.baobaotao.superTest;

import java.lang.reflect.InvocationTargetException;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestFinder {
	@SuppressWarnings("unchecked")
	public static void run (Class which,String[] args){
		System.out.println("----------- one testsuite start please wait a moment-----------");
		TestSuite suite=null;
		if(args.length!=0){
			java.lang.reflect.Constructor ctor;
			try {
				ctor=which.getConstructor(new Class[]{
						String.class
				});
				suite=new TestSuite();
				for(int i=0;i<args.length;i++){
					suite.addTest((Test) ctor.newInstance(new Object[]{args[i]}));
				}
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}else{
			suite=new TestSuite();
			suite.addTestSuite(which);
		}
		junit.textui.TestRunner.run(suite);
		System.out.println("----------- one testsuite end-----------");
	} 
}
