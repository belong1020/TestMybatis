package com.test.service;

import com.test.dao.ObjectMapper;
import com.test.pojo.User;
public class UserServiceImpl implements UserService {

	ObjectMapper userMapper;

	public User SelectByPrimaryKey(int id) {
		return (User) userMapper.selectByPrimaryKey(id);
	}

	/*
	 * public List<User> SelectAll() { return userMapper.(); }
	 */

}
