package com.fatcat.spinach.service.initDate;

import com.fatcat.spinach.pojo.PlateAsianInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface PlateAsianInfoService {

	public void savePlateAsianInfo(PlateAsianInfo plateAsianInfo);
	
	public int countPlateAsianInfoLikeMatchAndRound(String match, String round);
	
//	public String queryBallSizeInfoLikeName(String matchName);
//	
//	public List<MatchBaseInfo> queryMatchBaseInfoList();
	
	public int queryPlateAsianInfoById(String id);
	
	public int deleteById(String id);
	
}
