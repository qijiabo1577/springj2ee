package api.first.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import api.first.dao.FirstInfoDao;
import api.first.model.SysUser;

@Service("FirstInfoManager")
public class FirstInfoManagerImpl implements FirstInfoManager{
	
	@Resource
	private FirstInfoDao firstdao;
	
	public SysUser getSysUserById(String id){
		return firstdao.getSysUserById(id);
	}

	public List<SysUser> getAllSysUsersByRowNum(int num){
		return firstdao.getAllSysUsersByRowNum(num);
	}
}
