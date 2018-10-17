package com.fatcat.spinach.service.initDate.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fatcat.spinach.mapper.MatchBaseInfoMapper;
import com.fatcat.spinach.pojo.MatchBaseInfo;
import com.fatcat.spinach.service.initDate.MatchBaseInfoService;

@Service
public class MatchBaseInfoServiceImpl implements MatchBaseInfoService{
	
	private static Logger logger = Logger.getLogger(MatchBaseInfoServiceImpl.class);

	@Autowired
	MatchBaseInfoMapper matchBaseInfoMapper;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public String queryMatchBaseInfoLikeName(String matchName) {
		// TODO Auto-generated method stub
		
		logger.debug("run in queryMatchBaseInfoLikeName");
		String name = matchBaseInfoMapper.queryMatchBaseInfoLikeName(matchName);
		return name;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<MatchBaseInfo> queryMatchBaseInfoList() {
		// TODO Auto-generated method stub
		logger.debug("run in queryMatchBaseInfoList");
		List<MatchBaseInfo> re = matchBaseInfoMapper.selectAll();
		return re;
	}

}
