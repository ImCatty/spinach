package com.fatcat.spinach.service.initDate.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fatcat.spinach.mapper.PlateLetInfoMapper;
import com.fatcat.spinach.pojo.PlateLetInfo;
import com.fatcat.spinach.service.initDate.PlateLetInfoService;

@Service
public class PlateLetInfoServiceImpl implements PlateLetInfoService{
	
	private static Logger logger = Logger.getLogger(PlateLetInfoServiceImpl.class);

	@Autowired
	PlateLetInfoMapper plateLetInfoMapper;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void savePlateLetInfo(PlateLetInfo plateLetInfo){
		
		logger.debug("run in savePlateLetInfo");
		plateLetInfoMapper.insertSelective(plateLetInfo);
	}

	@Override
	public int countPlateLetInfoLikeMatchAndRound(String match, String round) {
		
		logger.debug("run in countPlateLetInfoLikeMatchAndRound");
		int c = 0;
//				plateLetInfoMapper.countBallSizeInfoById(match, round);
		return c;
	}

	@Override
	public int queryPlateLetInfoById(String id) {
		
		logger.debug("run in queryBallsizeInfoById");
		int re = plateLetInfoMapper.queryPlateLetInfoById(id);
		return re;
	}

	@Override
	public int deleteById(String id) {

		logger.debug("run in deleteById");
		int re = plateLetInfoMapper.deleteById(id);
		return re;
	}

}
