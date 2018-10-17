package com.fatcat.spinach.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.DoubleResultInfo;
import com.fatcat.spinach.utils.MyMapper;

public interface DoubleResultInfoMapper extends MyMapper<DoubleResultInfo> {
	
	@Select("select count(double_result_id) as c from double_result_info where double_result_id like '${match}%' and double_result_id like '%${round}'")
	int countDoubleResultInfoById(@Param("match") String match, @Param("round") String round);
	
	@Select("select count(double_result_id) as c from double_result_info where double_result_id='${double_result_id}'")
	int queryDoubleResultInfoById(@Param("double_result_id") String double_result_id);
	
	@Delete("delete from double_result_info where double_result_id='${double_result_id}'")
	int deleteById(@Param("double_result_id") String double_result_id);
}