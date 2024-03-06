package com.springboot.dao;

import com.springboot.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
