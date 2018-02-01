package com.test.service;

import com.gnt.entity.User;

public interface UserService {
	
	User SelectByPrimaryKey(int id);
	/*
	 * List<User> SelectAll();
	 */
}
