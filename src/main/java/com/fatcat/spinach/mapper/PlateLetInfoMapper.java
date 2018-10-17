package com.fatcat.spinach.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.PlateLetInfo;
import com.fatcat.spinach.utils.MyMapper;

public interface PlateLetInfoMapper extends MyMapper<PlateLetInfo> {
	
	@Select("select count(plate_let_id) c from plate_let_info where plate_let_id='${plate_let_id}'")
	int queryPlateLetInfoById(@Param("plate_let_id") String plate_let_id);
	
	@Delete("delete from plate_let_info where plate_let_id='${plate_let_id}'")
	int deleteById(@Param("plate_let_id") String plate_let_id);
}