package com.test.controller;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.dao.UserMapper1;
import com.test.pojo.User;

public class UserController {

	public static SqlSessionFactory sqlSessionFactory;
	public static Reader reader;
	static {
		try {
			reader = Resources.getResourceAsReader("MybatisConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static User SelectByPrimaryKey(int id) {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			UserMapper1 mapper = session.getMapper(UserMapper1.class);
			return mapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

}
