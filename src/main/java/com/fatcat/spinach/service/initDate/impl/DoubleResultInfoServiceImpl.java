package com.fatcat.spinach.service.initDate.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatcat.spinach.mapper.DoubleResultInfoMapper;
import com.fatcat.spinach.pojo.DoubleResultInfo;
import com.fatcat.spinach.service.initDate.DoubleResultInfoService;

@Service
public class DoubleResultInfoServiceImpl implements DoubleResultInfoService{
	
	private static Logger logger = Logger.getLogger(DoubleResultInfoServiceImpl.class);

	@Autowired
	DoubleResultInfoMapper doubleResultInfoMapper;

	@Override
	public void saveDoubleResultInfo(DoubleResultInfo doubleResultInfo) {
		
		logger.debug("run in saveDoubleResultInfo");
		doubleResultInfoMapper.insertSelective(doubleResultInfo);
	}

	@Override
	public int countDoubleResultInfoLikeMatchAndRound(String match, String round) {

		logger.debug("run in countDoubleResultInfoLikeMatchAndRound");
		int c = doubleResultInfoMapper.countDoubleResultInfoById(match, round);
		return c;
	}

	@Override
	public int queryDoubleResultInfoById(String id) {
		
		logger.debug("run in queryDoubleResultInfoById");
		int re = doubleResultInfoMapper.queryDoubleResultInfoById(id);
		return re;
	}

	@Override
	public int deleteById(String id) {
		
		logger.debug("run in deleteById");
		int re = doubleResultInfoMapper.deleteById(id);
		return re;
	}
	
}
