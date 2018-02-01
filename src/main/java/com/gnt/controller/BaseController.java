package com.gnt.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gnt.entity.Base;
import com.gnt.entity.User;
import com.gnt.entity.UserKey;
import com.gnt.mapper.BaseMapper;
import com.gnt.mapper.UserMapper;


/**
 * 
 * @author Belong.
 * @param <K>		xxxMapper
 * @param <V>		xxx (entity)
 */
public class BaseController<K extends BaseMapper, V > {

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

	public Base selectByPrimaryKey(UserKey uKey, K k) {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			K mapper = (K) session.getMapper(k.getClass());
			return  (Base) mapper.selectByPrimaryKey(uKey);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	
	public static List<User> selectAll() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			return  mapper.selectAll();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	

}
