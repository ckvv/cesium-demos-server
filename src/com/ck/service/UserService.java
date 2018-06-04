package com.ck.service;

public interface UserService {
	
	/**
	 * 登录 成功返回true 失败返回false
	 * @param name
	 * @param password
	 * @return
	 */
	boolean getUserByNameAndPass(String name,String password);
	
	/**
	 * 注册 成功返回true 失败返回false
	 * @param name
	 * @param password
	 * @return
	 */
	boolean insertUser(String name,String password);
}
