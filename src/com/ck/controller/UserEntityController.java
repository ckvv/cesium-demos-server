package com.ck.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ck.entity.UserEntity;
import com.ck.service.UserEntityService;

@Controller
@RequestMapping("/userentity/")
public class UserEntityController {
	@Autowired
	UserEntityService userEntityService;
	
	@RequestMapping("selectEntitysByName")  
	@ResponseBody
	public List<UserEntity> selectEntitysByName (@RequestParam("username")String username,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		System.out.print(userEntityService.selectEntitysByName(username));
		return userEntityService.selectEntitysByName(username);
	}
	
	@RequestMapping("insertEntity")  
	@ResponseBody
	public Boolean insertEntity (@RequestParam("name")String name,@RequestParam("entity")String entity,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		//System.out.print(data);
		userEntityService.insertEntity(name, entity);
		return true;
	}
	
}
