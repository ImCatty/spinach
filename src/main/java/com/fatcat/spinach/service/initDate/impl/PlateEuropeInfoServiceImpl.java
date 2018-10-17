package com.fatcat.spinach.service.initDate.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fatcat.spinach.mapper.PlateEuropeInfoMapper;
import com.fatcat.spinach.pojo.PlateEuropeInfo;
import com.fatcat.spinach.service.initDate.PlateEuropeInfoService;

@Service
public class PlateEuropeInfoServiceImpl implements PlateEuropeInfoService{
	
	private static Logger logger = Logger.getLogger(PlateEuropeInfoServiceImpl.class);

	@Autowired
	PlateEuropeInfoMapper plateEuropeInfoMapper;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void savePlateEuropeInfo(PlateEuropeInfo plateEuropeInfo){
		
		logger.debug("run in savePlateEuropeInfo");
		plateEuropeInfoMapper.insertSelective(plateEuropeInfo);
	}

	@Override
	public int countPlateEuropeInfoLikeMatchAndRound(String match, String round) {
		
		logger.debug("run in countPlateEuropeInfoLikeMatchAndRound");
		int c = plateEuropeInfoMapper.countBallSizeInfoById(match, round);
		return c;
	}

	@Override
	public int queryPlateEuropeInfoById(String id) {

		logger.debug("run in queryPlateEuropeInfoById");
		int re = plateEuropeInfoMapper.queryPlateEuropeInfoById(id);
		return re;
	}

	@Override
	public int deleteById(String id) {

		logger.debug("run in deleteById");
		int re = plateEuropeInfoMapper.deleteById(id);
		return re;
	}

}
