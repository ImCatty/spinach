package com.fatcat.spinach.service.initDate;

import com.fatcat.spinach.pojo.PlateLetInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface PlateLetInfoService {

	public void savePlateLetInfo(PlateLetInfo plateLetInfo);
	
	public int countPlateLetInfoLikeMatchAndRound(String match, String round);
	
//	public String queryBallSizeInfoLikeName(String matchName);
//	
//	public List<MatchBaseInfo> queryMatchBaseInfoList();
	
	public int queryPlateLetInfoById(String id);
	
	public int deleteById(String id);
	
}
