package api.first.service;

import java.util.List;

import api.first.model.SysUser;

public interface FirstInfoManager {
	public SysUser getSysUserById(String id);
	
	public List<SysUser> getAllSysUsersByRowNum(int num);
}
