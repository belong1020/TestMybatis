package com.gnt.mapper.imp;

import java.util.ArrayList;
import java.util.List;

import com.gnt.mapper.UserMapper;

public class UserMapperImpl<K, V> implements UserMapper<K, V>{

	@Override
	public List<V> selectAll() {
		List result = new ArrayList();
		result.add("111");
		result.add("222");
		return result;
	}

	@Override
	public V selectByPrimeryKey(V v) {
		return (V) ("selectByPrimeryKey in user " + v.toString());
	}

}
