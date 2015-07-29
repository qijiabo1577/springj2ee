package api.first.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import api.first.model.SysUser;
import api.first.service.FirstInfoManager;

@Scope("prototype")
@Controller
@RequestMapping("/api")
public class FirstAction {

	@Resource
	private FirstInfoManager firstInfoManager; 
	
	@RequestMapping(value = "/hello/{id}", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public SysUser sayHello(@PathVariable String id) throws InterruptedException {
		SysUser user=firstInfoManager.getSysUserById(id);
		return user;
	}
	
	@RequestMapping(value = "/helloAll", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public List<SysUser> helloToAll() throws InterruptedException {
		List<SysUser> users=firstInfoManager.getAllSysUsersByRowNum(5);
		return users;
	}

}
