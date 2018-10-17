package com.fatcat.spinach.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.PlateEuropeInfo;
import com.fatcat.spinach.utils.MyMapper;

public interface PlateEuropeInfoMapper extends MyMapper<PlateEuropeInfo> {
	
	@Select("select count(plante_europe_id) as c from plate_europe_info where plante_europe_id like '${match}%' and plante_europe_id like '%${round}'")
	int countBallSizeInfoById(@Param("match") String match, @Param("round") String round);
	
	@Select("select count(plante_europe_id) c from plate_europe_info where plante_europe_id='${plante_europe_id}'")
	int queryPlateEuropeInfoById(@Param("plante_europe_id") String plante_europe_id);
	
	@Delete("delete from plate_europe_info where plante_europe_id='${plante_europe_id}'")
	int deleteById(@Param("plante_europe_id") String plante_europe_id);
}