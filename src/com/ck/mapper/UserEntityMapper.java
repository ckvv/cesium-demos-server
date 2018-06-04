package com.ck.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ck.entity.UserEntity;

public interface UserEntityMapper {
	/**
	 * 根据姓名查找所有标签
	 * @param name
	 * @return User
	 */
	public List<UserEntity> selectEntitysByName(@Param("name")String name);
	
	public void insertEntity(@Param("name")String name,@Param("entity")String entity);
}
