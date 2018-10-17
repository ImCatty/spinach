package com.fatcat.spinach.service.initDate.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fatcat.spinach.mapper.TeamBaseInfoMapper;
import com.fatcat.spinach.pojo.TeamBaseInfo;
import com.fatcat.spinach.service.initDate.TeamBaseInfoService;

@Service
public class TeamBaseInfoServiceImpl implements TeamBaseInfoService{
	
	private static Logger logger = Logger.getLogger(TeamBaseInfoServiceImpl.class);

	@Autowired
	TeamBaseInfoMapper teamBaseInfoMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveTeamBaseInfo(TeamBaseInfo teamBaseInfo){
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateTeamBaseInfo(TeamBaseInfo teamBaseInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public String queryTeamBaseInfoLikeName(String teamName) {
		// TODO Auto-generated method stub
		
		logger.debug("run in queryTeamBaseInfoLikeName");
		String info =  teamBaseInfoMapper.queryTeamBaseInfoLikeName(teamName);
		return info;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<TeamBaseInfo> queryTeamBaseInfoList() {
		// TODO Auto-generated method stub
		
		logger.debug("run in queryTeamBaseInfoList");
		List<TeamBaseInfo> re = teamBaseInfoMapper.selectAll();
		return re;
	}
	
}
