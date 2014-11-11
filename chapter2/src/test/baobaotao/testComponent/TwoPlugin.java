package test.baobaotao.testComponent;

import org.springframework.stereotype.Repository;

@Repository
public class TwoPlugin extends Plugin{
	private String name="twoPlugin";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
