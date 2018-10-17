package com.fatcat.spinach.service.initDate;

import com.fatcat.spinach.pojo.DoubleResultInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface DoubleResultInfoService {

	public void saveDoubleResultInfo(DoubleResultInfo doubleResultInfo);
	
	public int countDoubleResultInfoLikeMatchAndRound(String match, String round);
	
	public int queryDoubleResultInfoById(String id);
	
	public int deleteById(String id);
}
