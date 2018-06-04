package com.ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ck.entity.UserEntity;
import com.ck.mapper.UserEntityMapper;
import com.ck.service.UserEntityService;

@Service
public class UserEntityServiceImpl implements UserEntityService {
	@Autowired
	UserEntityMapper userEntityMapper;

	@Override
	public List<UserEntity> selectEntitysByName(String name) {
		// TODO Auto-generated method stub
		return userEntityMapper.selectEntitysByName(name);
	}

	@Override
	public void insertEntity(String name, String entity) {
		// TODO Auto-generated method stub
		userEntityMapper.insertEntity(name, entity);
	}
}
