package com.domain.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.domain.repository.RoleRepository;
import com.domain.service.RoleService;

public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public String findRoleById(int id) {
		// TODO Auto-generated method stub
		return roleRepository.findRoleNameById(id);
	}

}
