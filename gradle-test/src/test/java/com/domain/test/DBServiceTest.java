package com.domain.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.domain.entity.Role;
import com.domain.repository.RoleRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest (classes = RepositoryConfiguration.class)
@Transactional
public class DBServiceTest {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Test
	public void test() {
		Role role = roleRepository.findById(1);
		
		assertEquals(role.getRole(), "ADMIN");
	}
}
