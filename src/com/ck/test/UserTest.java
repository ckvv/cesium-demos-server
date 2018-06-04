package com.ck.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ck.mapper.UserMapper;
import com.ck.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Test
	public void Test() {
	}
	
	@Test
	public void getUserByNameTest() {
		System.out.print(userMapper.selectUserByName("ck"));
	}
	
	@Test
	public void getUserByNameAndPassTest() {
		System.out.print(userServiceImpl.getUserByNameAndPass("ck","admin"));
	}
}
