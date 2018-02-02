package com.gtn;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gnt.controller.BaseController;
import com.gnt.entity.Produce;
import com.gnt.entity.ProduceKey;
import com.gnt.entity.User;
import com.gnt.entity.UserKey;
import com.gnt.mapper.BaseMapper;
import com.gnt.mapper.ProduceMapper;
import com.gnt.mapper.UserMapper;
import com.gnt.service.BaseService;

public class TestProService {

	BaseService<BaseMapper<String, String>, String> service;
	
	@Before
	public void setUp() {
	}

	@Test
	public void testSelectByPrimeryKey() {
		ProduceKey prokey = new ProduceKey();
		prokey.setId(1);
		prokey.setType(2);
		System.out.println(BaseController.selectByPrimaryKey(prokey, UserMapper.class));
		
	}
	
	@Test
	public void testSelectAll() {
		List<Produce> list = BaseController.selectAll(ProduceMapper.class);
		list.forEach((user)->{
			System.out.println(user.toString());
		});		
	}
	
	public static void main(String[] args) {
		TestProService t1 = new TestProService();
		t1.testSelectAll();
	}
}
