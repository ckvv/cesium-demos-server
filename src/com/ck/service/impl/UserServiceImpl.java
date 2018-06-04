package com.ck.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ck.mapper.UserMapper;
import com.ck.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public boolean getUserByNameAndPass(String name, String password) {
		// TODO Auto-generated method stub
		if(userMapper.selectUserByNameAndPass(name, password) !=0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean insertUser(String name, String password) {
		// TODO Auto-generated method stub
		if(userMapper.selectUserCountByName(name)!=0){
			return false;
		}else{
			userMapper.insertUser(name, password);
			return true;
		}
	}
	
	
}
