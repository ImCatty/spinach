package com.fatcat.spinach.service.initDate;

import com.fatcat.spinach.pojo.PlateEuropeInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface PlateEuropeInfoService {

	public void savePlateEuropeInfo(PlateEuropeInfo plateEuropeInfo);
	
	public int countPlateEuropeInfoLikeMatchAndRound(String match, String round);
	
//	public String queryBallSizeInfoLikeName(String matchName);
//	
//	public List<MatchBaseInfo> queryMatchBaseInfoList();
	
	public int queryPlateEuropeInfoById(String id);
	
	public int deleteById(String id);
	
}
