package com.fatcat.spinach.service.initDate.impl;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fatcat.spinach.mapper.StoredRecordMapper;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.service.initDate.StoredRecordInfoService;

@Service
public class StoredRecordInfoServiceImpl implements StoredRecordInfoService{
	
	private static Logger logger = Logger.getLogger(StoredRecordInfoServiceImpl.class);

	@Autowired
	StoredRecordMapper storedRecordMapper;
	
	@Autowired
	StoredRecord storedRecord;

	@Override
	public boolean queryStoredRecordInfo(String excelName) {
		
		logger.debug("run in queryStoredRecordInfo");
//		int status = storedRecordMapper.queryStoredRecordInfoByExcelName(excelName);
		boolean b = storedRecordMapper.existsWithPrimaryKey(excelName);
		
		return b;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveStoredRecordInfo(String path) {
		
		logger.debug("run in saveStoredRecordInfo");
		
		File f = new File(path);
		String recordName =  f.getName();
		storedRecord.setRecordName(recordName);
		storedRecord.setRecordStatus(1);
		storedRecordMapper.insertSelective(storedRecord);
		
	}

	@Override
	public List<StoredRecord> queryStoredRecord() {

		logger.debug("run in queryStoredRecord");
		List<StoredRecord> re = storedRecordMapper.selectAll();
		return re;
	}

	@Override
	public int updStoredRecordInfo(String path) {
		
		logger.debug("run in updStoredRecordInfo");
		File f = new File(path);
		String recordName =  f.getName();
		storedRecord.setRecordName(recordName);
		storedRecord.setRecordStatus(2);
		Date date = new Date();
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String s = df.format(date);
        storedRecord.setUpdateTime(date);
		int re = storedRecordMapper.updateByPrimaryKeySelective(storedRecord);
		return re;
	}
	
}
