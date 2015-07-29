package api.first.dao;

import java.util.List;

import api.first.model.SysUser;

public interface FirstInfoDao {
	SysUser getSysUserById(String id);
	
	List<SysUser> getAllSysUsersByRowNum(int num);
}
