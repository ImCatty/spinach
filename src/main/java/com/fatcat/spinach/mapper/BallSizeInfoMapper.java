package com.fatcat.spinach.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.BallSizeInfo;
import com.fatcat.spinach.utils.MyMapper;

public interface BallSizeInfoMapper extends MyMapper<BallSizeInfo> {
		
	@Select("select count(ball_size_id) as c from ball_size_info where ball_size_id like '${match}%' and ball_size_id like '%${round}'")
	int countBallSizeInfoById(@Param("match") String match, @Param("round") String round);
	
	@Select("select distinct(ball_size_id) from ball_size_info where ball_size_id like '%null%'")
	@Results({
		@Result(property = "ballSizeId", column = "ball_size_id"),
	})
	List<BallSizeInfo> queryBallSizeInfoLikeNull();
	
	@Select("select count(ball_size_id) c from ball_size_info where ball_size_id='${ball_size_id}'")
	int queryBallsizeInfoById(@Param("ball_size_id") String ball_size_id);
	
	@Delete("delete from ball_size_info where ball_size_id='${ball_size_id}'")
	int deleteById(@Param("ball_size_id") String ball_size_id);
	
}