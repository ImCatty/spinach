package com.fatcat.spinach.service.initDate;

import java.util.List;

import com.fatcat.spinach.pojo.BallSizeInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface BallSizeInfoService {

	public void saveBallSizeInfo(BallSizeInfo ballSizeInfo);
	
	public int countBallSizeInfoLikeMatchAndRound(String match, String round);
	
	public List<BallSizeInfo> queryBallSizeInfoLikeNull();
	
	public int queryBallsizeInfoById(String id);
	
	public int deleteById(String id);
}
