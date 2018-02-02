package com.gnt.service;

import java.util.List;

import com.gnt.mapper.BaseMapper;
import com.gnt.mapper.UserMapper;

@Deprecated
public class UserService<UserKey, User> extends BaseService<UserKey, User> {

	// UserMapper<K, V> userMapper;

	public UserService() {
	}

	public UserService(UserMapper userMapper) {
		this.baseMapper = (BaseMapper<UserKey, User>) userMapper;
	}

	public List<User> selectAll() {
		return (List<User>) ((UserMapper) this.baseMapper).selectAll();

	}

}
