package com.ck.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ck.entity.ZZTaxi;
import com.ck.service.ZZTaxiService;

@Controller
@RequestMapping("/zztaxi/")
public class ZZTaxiController {
	@Autowired
	ZZTaxiService zzTaxiService;
	
	@RequestMapping("selectZZTaxisByTime")  
	@ResponseBody
	public List<ZZTaxi> selectZZTaxisByTime (@RequestParam("t_time")String t_time,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return zzTaxiService.selectZZTaxisByTime(t_time);
	}
	
//	@RequestMapping(value="test",produces = { "application/json;charset=UTF-8" })  
//	@ResponseBody
//	public String test(@RequestParam("data") String data) {
//		String result="";
//		System.out.print(data);
//		for(int i=0;i<=10000;i++){
//			result+=data;
//		}
//		return "test:"+result;
//	}
}
