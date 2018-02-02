package com.gnt.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gnt.mapper.BaseMapper;

/**
 * 
 * @author Belong.
 * @param <K>
 *            xxxKey
 * @param <V>
 *            xxx (entity)
 */
public class BaseController {

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

	public static <K, T> T selectByPrimaryKey(K k, Class<T> clazz) {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			T mapper = (T) session.getMapper(clazz);
			return (T) ((BaseMapper) mapper).selectByPrimaryKey(k);
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	public static <K, V, T extends BaseMapper> List<V> selectAll(Class<T> clazz) {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			T mapper = session.getMapper(clazz);
			return ((T) mapper).selectAll();
		} catch (Exception e) {
			e.getStackTrace();
			//NullPorintException  对应mapper.xml 中不存在 selectAll 方法sql 实现时
			//会报NullPointException 异常
			return null;
		} finally {
			session.close();
		}
	}

}
