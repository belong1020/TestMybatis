package com.gtn;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gnt.controller.BaseController;
import com.gnt.entity.Base;
import com.gnt.entity.User;
import com.gnt.entity.UserKey;
import com.gnt.mapper.BaseMapper;
import com.gnt.mapper.UserMapper;
import com.gnt.service.BaseService;

public class TestBaseService {

	BaseService<BaseMapper<String, String>, String> service;
	
	@Before
	public void setUp() {
	}

	@Test
	public void testSelectByPrimeryKey() {
		UserKey uKey = new UserKey();
		uKey.setId(1);
		
		System.out.println(BaseController.selectByPrimaryKey(uKey, UserMapper.class));
		
	}
	
	@Test
	public void testSelectAll() {
		List<User> list = 	BaseController.selectAll(UserMapper.class);
		list.forEach((user)->{
			System.out.println(user.toString());
		});
	}
}
