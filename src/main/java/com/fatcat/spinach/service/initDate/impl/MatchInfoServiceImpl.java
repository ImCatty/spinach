package com.fatcat.spinach.service.initDate.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatcat.spinach.mapper.MatchInfoMapper;
import com.fatcat.spinach.pojo.MatchInfo;
import com.fatcat.spinach.service.initDate.MatchInfoService;

@Service
public class MatchInfoServiceImpl implements MatchInfoService{
	
	private static Logger logger = Logger.getLogger(MatchInfoServiceImpl.class);

	@Autowired
	MatchInfoMapper matchInfoMapper;

	@Override
	public void saveMatchInfo(MatchInfo matchInfo) {

		logger.debug("run in saveMatchInfo");
		matchInfoMapper.insertSelective(matchInfo);
	}

	@Override
	public int queryMatchInfoById(String id) {

		logger.debug("run in queryMatchInfoById");
		int re = matchInfoMapper.queryBallsizeInfoById(id);
		return re;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
