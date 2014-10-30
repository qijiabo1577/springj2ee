package com.baobaotao.reflect;

import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class FileSourceExample {
	public static void main(String[] args) throws Exception{
		String filePath="C:/Users/Administrator/Desktop/二所预警表.sql";
		//使用系统文件路径方式加载文件
		Resource res1=new FileSystemResource(filePath);
		
		Resource res2=new ClassPathResource("");
		
		InputStream ins1=res1.getInputStream();
		
		InputStream ins2=res2.getInputStream();
		System.out.print("res1:"+res1.getFilename());
	}
}
