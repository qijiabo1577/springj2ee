package test.baobaotao.service;


import test.baobaotao.superTest.SuperTest;
import junit.framework.*;
public class TestSuite2 extends SuperTest{
	
	public TestSuite2 (String method){
		super(method);
	}
	
	public void testAdd(){
		assertEquals(2,1+1);
	}
	
	public void testSub(){
		assertEquals(0,1+1);
	}
	
	
	
	
	public static TestSuite suite(){
		TestSuite suite=new TestSuite();
		suite.addTestSuite(TestUserService_superTest.class);
		return  suite;
	}
}
