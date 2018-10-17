package com.fatcat.spinach.service.initDate.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fatcat.spinach.mapper.BallSizeInfoMapper;
import com.fatcat.spinach.pojo.BallSizeInfo;
import com.fatcat.spinach.service.initDate.BallSizeInfoService;

@Service
public class BallSizeInfoServiceImpl implements BallSizeInfoService{
	
	private static Logger logger = Logger.getLogger(BallSizeInfoServiceImpl.class);

	@Autowired
	BallSizeInfoMapper ballSizeInfoMapper;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveBallSizeInfo(BallSizeInfo ballSizeInfo){
		
		logger.debug("run in saveBallSizeInfo");
		ballSizeInfoMapper.insertSelective(ballSizeInfo);

	}

	@Override
	public int countBallSizeInfoLikeMatchAndRound(String match, String round) {

		logger.debug("run in countBallSizeInfoLikeMatchAndRound");
		int c = ballSizeInfoMapper.countBallSizeInfoById(match, round);
		return c;
	}

	@Override
	public List<BallSizeInfo> queryBallSizeInfoLikeNull() {

		logger.debug("run in queryBallSizeInfoLikeNull");
		List<BallSizeInfo> re = ballSizeInfoMapper.queryBallSizeInfoLikeNull();
		return re;
	}

	@Override
	public int queryBallsizeInfoById(String id) {

		logger.debug("run in queryBallsizeInfoById");
		int re = ballSizeInfoMapper.queryBallsizeInfoById(id);
		return re;
	}

	@Override
	public int deleteById(String id) {

		logger.debug("run in deleteById");
		int re = ballSizeInfoMapper.deleteById(id);
		return re;
	}
}
