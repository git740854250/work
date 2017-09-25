package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.RoleDao;

import pojo.Role;
import service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	/**
	 * 查询所有角色信息
	 */
	@Override
	public List<Role> queryAllRole() {
		// TODO Auto-generated method stub
		return roleDao.queryAllRole();
	}
}
