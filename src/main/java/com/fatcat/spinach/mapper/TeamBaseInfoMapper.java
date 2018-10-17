package com.fatcat.spinach.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.TeamBaseInfo;
import com.fatcat.spinach.utils.MyMapper;

public interface TeamBaseInfoMapper extends MyMapper<TeamBaseInfo> {

	@Select("select * from team_base_info where team_name like '%${teamName}%'")
	@Results({
		@Result(property = "team_name_abbreviation", column = "team_name_abbreviation"),
	})
	String queryTeamBaseInfoLikeName(@Param("teamName") String teamName);
}