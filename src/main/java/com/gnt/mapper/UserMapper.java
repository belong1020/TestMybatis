package com.gnt.mapper;

import java.util.List;

import com.gnt.entity.User;

public interface UserMapper extends BaseMapper {
	List<User> selectAll();
}