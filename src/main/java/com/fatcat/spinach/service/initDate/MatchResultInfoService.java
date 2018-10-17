package com.fatcat.spinach.service.initDate;

import com.fatcat.spinach.pojo.MatchResultInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface MatchResultInfoService {

	public void saveMatchResultInfo(MatchResultInfo matchResultInfo);
	
	public int queryMatchResultInfoById(String id);
	
	public int deleteById(String id);
}
