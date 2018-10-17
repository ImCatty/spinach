package com.fatcat.spinach.service.initDate;

import java.util.List;

import com.fatcat.spinach.pojo.StoredRecord;



/**
 * 
 * @author fatcat
 *
 */
public interface StoredRecordInfoService {
	
	public boolean queryStoredRecordInfo(String excelName);
	
	public List<StoredRecord> queryStoredRecord();
	
	public void saveStoredRecordInfo(String path);
	
	public int updStoredRecordInfo(String path);
}
