package com.fatcat.spinach.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.MatchBaseInfo;
import com.fatcat.spinach.utils.MyMapper;

public interface MatchBaseInfoMapper extends MyMapper<MatchBaseInfo> {

	@Select("select * from match_base_info where match_name like '%${matchName}%'")
	@Results({
		@Result(property = "match_base_id", column = "match_base_id"),
	})
	String queryMatchBaseInfoLikeName(String matchName);
}