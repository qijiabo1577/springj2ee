package com.baobaotao.demo.resource;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class PatternResolverTest {
	public static void main(String[] args) throws IOException{
		ResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
		Resource res[]=resolver.getResources("classpath*:com/baobaotao/**/*.xml");
		for(Resource resTmp:res){
			System.out.println(resTmp.getDescription());
		}
	}
}
