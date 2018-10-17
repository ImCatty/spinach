package com.fatcat.spinach.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.PlateAsianInfo;
import com.fatcat.spinach.utils.MyMapper;

public interface PlateAsianInfoMapper extends MyMapper<PlateAsianInfo> {
	
	@Select("select count(plate_asian_id) as c from plate_asian_info where plate_asian_id like '${match}%' and plate_asian_id like '%${round}'")
	int countBallSizeInfoById(@Param("match") String match, @Param("round") String round);
	
	@Select("select count(plate_asian_id) c from plate_asian_info where plate_asian_id='${plate_asian_id}'")
	int queryPlateAsianInfoById(@Param("plate_asian_id") String plate_asian_id);
	
	@Delete("delete from plate_asian_info where plate_asian_id='${plate_asian_id}'")
	int deleteById(@Param("plate_asian_id") String plate_asian_id);
}