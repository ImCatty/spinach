package com.fatcat.spinach.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.utils.MyMapper;

public interface StoredRecordMapper extends MyMapper<StoredRecord> {
	
	@Select("select * from stored_record where record_name = '${recordName}'")
	@Results({
		@Result(property = "record_status", column = "record_status"),
	})
	int queryStoredRecordInfoByExcelName(@Param("recordName") String recordName);
}