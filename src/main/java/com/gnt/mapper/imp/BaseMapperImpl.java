package com.gnt.mapper.imp;

import java.util.List;

import com.gnt.entity.User;
import com.gnt.entity.UserExample;
import com.gnt.entity.UserKey;
import com.gnt.mapper.BaseMapper;

public class BaseMapperImpl<K, V> implements BaseMapper<K, V>{

//	@Override
	public V selectByPrimeryKey(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteByPrimaryKey(UserKey key) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	public User selectByPrimaryKey(UserKey key) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*@Override
	public V selectByPrimeryKey(V v) {
		return (V) ("selectByPrimeryKey" + v.toString());
	}*/


}
