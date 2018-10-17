package com.fatcat.spinach.service;

import java.util.List;

import com.fatcat.spinach.pojo.MatchBaseInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface MatchBaseInfoService {

//	public  void saveMatchBaseInfo(MatchBaseInfo matchBaseInfo) throws Exception;
	
	
	public String queryMatchBaseInfoLikeName(String matchName);
	
	public List<MatchBaseInfo> queryMatchBaseInfoList();
	
}
