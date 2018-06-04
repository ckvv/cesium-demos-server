package com.ck.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ck.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("userRegister")  
	@ResponseBody
	public boolean userRegister (@RequestParam("username")String username,@RequestParam("password") String password,HttpServletResponse response,HttpServletRequest request) {
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		Cookie cookie = new Cookie("md5", "adjfbaljdsbfal");
//		response.addHeader("Access-Control-Allow-Credentials", "true");
//		response.addCookie(cookie);
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		response.setHeader("Access-Control-Allow-Methods","GET, POST, PUT, DELETE");
		Cookie cookie = new Cookie("md5", "adjfbaljdsbfal");
		response.addCookie(cookie);
		if(userService.insertUser(username, password)){
			return true;
		}else{
			return false;
		}
	}
	
	@RequestMapping(value="userLogin")  
	@ResponseBody
	public boolean userLogin(@RequestParam("username")String username,@RequestParam("password") String password,HttpServletResponse response,HttpServletRequest request) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		if(userService.getUserByNameAndPass(username, password)){
//			Cookie cookie = new Cookie("md5", "adjfbaljdsbfal");
//			response.addCookie(cookie);
			return true;
		}else{
			return false;
		}
	}
	
	
}
