package com.fatcat.spinach.service;

import java.util.List;

import com.fatcat.spinach.pojo.TeamBaseInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface TeamBaseInfoService {

	public  void saveTeamBaseInfo(TeamBaseInfo teamBaseInfo) throws Exception;
	
	public void updateTeamBaseInfo(TeamBaseInfo teamBaseInfo);
	
	public String queryTeamBaseInfoLikeName(String teamName);
	
	public List<TeamBaseInfo> queryTeamBaseInfoList();
}
