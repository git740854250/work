package dao;

import java.util.List;

import pojo.Role;

public interface RoleDao {
	
	/**
	 * 查询所有角色信息
	 * @return
	 */
	public List<Role> queryAllRole();
}
