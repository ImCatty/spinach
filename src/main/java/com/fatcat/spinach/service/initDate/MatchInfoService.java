package com.fatcat.spinach.service.initDate;

import com.fatcat.spinach.pojo.MatchInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface MatchInfoService {

	public void saveMatchInfo(MatchInfo matchInfo);
	
	public int queryMatchInfoById(String id);
	
	public int deleteById(String id);

}
