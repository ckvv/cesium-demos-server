package com.ck.mapper;

import org.apache.ibatis.annotations.Param;

import com.ck.entity.User;

public interface UserMapper {
	/**
	 * 根据姓名查找用户
	 * @param name
	 * @return User
	 */
	public User selectUserByName(@Param("name")String name);
	
	public int selectUserCountByName(@Param("name")String name);
	
	public int selectUserByNameAndPass(@Param("name")String name,@Param("password")String password);
	
	public void insertUser(@Param("name")String name,@Param("password")String password);
}
