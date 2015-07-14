package api.first;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baobaotao.reflect.Car;

@Scope("prototype")
@Controller
@RequestMapping("/api")
public class FirstAction {

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Car sayHello(HttpServletRequest request,
			HttpServletResponse response) throws InterruptedException {
		System.out.print("a");
		Car car=new Car();
		car.setBrand("±¦Âí");
		car.setColor("À¶É«");
		car.setMaxSpeed(200);
		return car;
	}

}
