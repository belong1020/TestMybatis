package com.gtn;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gnt.controller.UserController;
import com.gnt.entity.User;
import com.gnt.mapper.BaseMapper;
import com.gnt.mapper.imp.BaseMapperImpl;
import com.gnt.service.BaseService;

public class TestUserService {

	BaseService<BaseMapper<String, String>, String> service;

	@Before
	public void setUp() throws Exception {
		service = new BaseService<BaseMapper<String, String>, String>(new BaseMapperImpl<String, String>());
	}

	@Test
	public void testSelectByPrimeryKey() {
		// System.out.println( service.selectByPrimeryKey("1") );
		System.out.println(UserController.selectByPrimaryKey(1));

	}

	@Test
	public void testSelectAll() {
		
		List<User> selectAll = UserController.selectAll();
		selectAll.forEach((user) -> {
			System.out.println(user.toString());
		});

	}
}
