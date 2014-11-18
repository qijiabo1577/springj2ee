package test.baobaotao.testComponent;

import org.springframework.stereotype.Repository;

import test.baobaotao.superTest.SuperTest;

@Repository
public class OnePlugin extends Plugin{
	private String name="one";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
