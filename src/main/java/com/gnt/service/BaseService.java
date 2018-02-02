package com.gnt.service;

import com.gnt.mapper.BaseMapper;

public class BaseService<K, V> {

	BaseMapper<K, V> baseMapper;

	public BaseService() {
	}

	public BaseService(BaseMapper baseMapper) {
		this.baseMapper = baseMapper;
	}

	public V selectByPrimeryKey(K k) {
		return this.baseMapper.selectByPrimaryKey(k);
	}
}
