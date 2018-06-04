package com.ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ck.entity.ZZTaxi;
import com.ck.mapper.ZZTaxiMapper;
import com.ck.service.ZZTaxiService;

@Service
public class ZZTaxiServiceImpl implements ZZTaxiService {
	
	@Autowired
	ZZTaxiMapper zzTaxiMapper;
	
	@Override
	public List<ZZTaxi> selectZZTaxisByTime(String t_time) {
		// TODO Auto-generated method stub
		return zzTaxiMapper.selectZZTaxisByTime(t_time);
	}
	
}
