package com.fatcat.spinach.controller.initData;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fatcat.spinach.pojo.CompanyInfo;
import com.fatcat.spinach.pojo.MatchBaseInfo;
import com.fatcat.spinach.pojo.TeamBaseInfo;
import com.fatcat.spinach.service.initDate.CompanyInfoService;
import com.fatcat.spinach.service.initDate.MatchBaseInfoService;
import com.fatcat.spinach.service.initDate.TeamBaseInfoService;

/**
 * 初始化基础数据用
 * @author fatcat
 *
 */
@Controller
public class InitBaseDataInfo {
	
	private final static Logger logger = LoggerFactory.getLogger(InitBaseDataInfo.class);

	@Autowired
	TeamBaseInfoService teamBaseInfoService;
	
	@Autowired
	TeamBaseInfo teamBaseInfo;
	
	@Autowired
	MatchBaseInfoService matchBaseInfoService;
	
	@Autowired
	MatchBaseInfo matchBaseInfo;
	
	@Autowired
	CompanyInfoService companyInfoService;
	
	@Autowired
	CompanyInfo companyInfo;
	
	public static List<TeamBaseInfo> teamList;
	public static List<MatchBaseInfo> matchList;
	public static List<CompanyInfo> companyList;
	
	/**
	 * 初始化基础数据
	 */
    public void initBaseData(){
		
		logger.debug("run in initBaseData");
		teamList = teamBaseInfoService.queryTeamBaseInfoList();
		matchList = matchBaseInfoService.queryMatchBaseInfoList();
		companyList = companyInfoService.queryCompanyInfoList();
	}
}
