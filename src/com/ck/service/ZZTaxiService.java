package com.ck.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ck.entity.ZZTaxi;

public interface ZZTaxiService {
	/**
	 * 根据时间戳查找所有出租车
	 * @param t_time
	 * @return List<ZZTaxi>
	 */
	 public List<ZZTaxi> selectZZTaxisByTime(@Param("t_time")String t_time);
}
