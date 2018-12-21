package com.domain.service;

import com.domain.entity.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
