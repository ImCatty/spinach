package com.fatcat.spinach.service.initDate.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatcat.spinach.mapper.MatchResultInfoMapper;
import com.fatcat.spinach.pojo.MatchResultInfo;
import com.fatcat.spinach.service.initDate.MatchResultInfoService;

@Service
public class MatchResultInfoServiceImpl implements MatchResultInfoService{
	
	private static Logger logger = Logger.getLogger(MatchResultInfoServiceImpl.class);

	@Autowired
	MatchResultInfoMapper matchResultInfoMapper;

	@Override
	public void saveMatchResultInfo(MatchResultInfo matchResultInfo) {
		// TODO Auto-generated method stub
		logger.debug("run in saveMatchResultInfo");
		matchResultInfoMapper.insert(matchResultInfo);
	}

	@Override
	public int queryMatchResultInfoById(String id) {
		
		logger.debug("run in queryMatchResultInfoById");
		int re = matchResultInfoMapper.queryResultInfoById(id);
		return re;
	}

	@Override
	public int deleteById(String id) {

		logger.debug("run in deleteById");
		int re = matchResultInfoMapper.deleteById(id);
		return re;
	}
	
}
