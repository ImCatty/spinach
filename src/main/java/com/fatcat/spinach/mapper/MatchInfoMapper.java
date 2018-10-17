package com.fatcat.spinach.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.MatchInfo;
import com.fatcat.spinach.utils.MyMapper;

public interface MatchInfoMapper extends MyMapper<MatchInfo> {
	
	@Select("select count(match_id) c from match_info where match_id='${match_id}'")
	int queryBallsizeInfoById(@Param("match_id") String match_id);
	
	@Delete("delete from match_info where match_id='${match_id}'")
	int deleteById(@Param("match_id") String match_id);
}