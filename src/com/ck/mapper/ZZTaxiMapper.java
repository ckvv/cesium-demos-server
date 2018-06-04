package com.ck.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ck.entity.ZZTaxi;

public interface ZZTaxiMapper {
	/**
	 * 根据姓名查找所有标签
	 * @param t_time
	 * @return User
	 */
	public List<ZZTaxi> selectZZTaxisByTime(@Param("t_time")String t_time);
}
