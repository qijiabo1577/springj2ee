package test.baobaotao.testComponent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {
	@Autowired(required=true)
	private List<Plugin> plist;
	
	public List<Plugin> getPlugins(){
		return plist;
	}
}
