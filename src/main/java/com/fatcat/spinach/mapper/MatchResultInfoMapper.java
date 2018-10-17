package com.fatcat.spinach.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.MatchResultInfo;
import com.fatcat.spinach.utils.MyMapper;

public interface MatchResultInfoMapper extends MyMapper<MatchResultInfo> {
	
	@Select("select count(match_result_id) c from match_result_info where match_result_id='${match_result_id}'")
	int queryResultInfoById(@Param("match_result_id") String match_result_id);
	
	@Delete("delete from match_result_info where match_result_id='${match_result_id}'")
	int deleteById(@Param("match_result_id") String match_result_id);
}