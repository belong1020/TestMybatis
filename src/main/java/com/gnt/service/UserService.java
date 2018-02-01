package com.gnt.service;

import java.util.List;

import com.gnt.mapper.UserMapper;

public class UserService<UserKey, User> extends BaseService<UserKey, User>{
	
//	UserMapper<K, V> userMapper;
	
	public UserService() {
	}
	
	public UserService(UserMapper userMapper) {
		this.baseMapper = userMapper;
	}
	
	public List<User> selectAll(){
		return ((UserMapper)this.baseMapper).selectAll();
		
	}

}
