package com.fatcat.spinach.service.initDate.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fatcat.spinach.mapper.PlateAsianInfoMapper;
import com.fatcat.spinach.pojo.PlateAsianInfo;
import com.fatcat.spinach.service.initDate.PlateAsianInfoService;

@Service
public class PlateAsianInfoServiceImpl implements PlateAsianInfoService{
	
	private static Logger logger = Logger.getLogger(PlateAsianInfoServiceImpl.class);

	@Autowired
	PlateAsianInfoMapper plateAsianInfoMapper;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void savePlateAsianInfo(PlateAsianInfo plateAsianInfo){
		
		logger.debug("run in savePlateAsianInfo");
		plateAsianInfoMapper.insertSelective(plateAsianInfo);
	}

	@Override
	public int countPlateAsianInfoLikeMatchAndRound(String match, String round) {
		
		logger.debug("run in countPlateAsianInfoLikeMatchAndRound");
		int c = plateAsianInfoMapper.countBallSizeInfoById(match, round);
		return c;
	}

	@Override
	public int queryPlateAsianInfoById(String id) {

		logger.debug("run in queryPlateAsianInfoById");
		int re = plateAsianInfoMapper.queryPlateAsianInfoById(id);
		return re;
	}

	@Override
	public int deleteById(String id) {

		logger.debug("run in deleteById");
		int re = plateAsianInfoMapper.deleteById(id);
		return re;
	}

}
