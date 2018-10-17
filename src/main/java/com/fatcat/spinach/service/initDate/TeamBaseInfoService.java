package com.fatcat.spinach.service.initDate;

import java.util.List;

import com.fatcat.spinach.pojo.TeamBaseInfo;

/**
 * 
 * @author fatcat
 *
 */
public interface TeamBaseInfoService {

	public void saveTeamBaseInfo(TeamBaseInfo teamBaseInfo);
	
	public void updateTeamBaseInfo(TeamBaseInfo teamBaseInfo);
	
	public String queryTeamBaseInfoLikeName(String teamName);
	
	public List<TeamBaseInfo> queryTeamBaseInfoList();
}
