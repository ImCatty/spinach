package com.fatcat.spinach.controller.initData;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fatcat.spinach.pojo.DoubleResultInfo;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.service.initDate.DoubleResultInfoService;
import com.fatcat.spinach.service.initDate.StoredRecordInfoService;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化比赛信息数据用
 * @author fatcat
 *
 */
@Controller
public class InitDoubleResultData extends InitBaseDataInfo{
	
	private final static Logger logger = LoggerFactory.getLogger(InitDoubleResultData.class);
	
	@Autowired
	DoubleResultInfo doubleResultInfo;
	
	@Autowired
	DoubleResultInfoService doubleResultInfoService;
	
	@Autowired
	StoredRecord storedRecord;
	
	@Autowired
	StoredRecordInfoService storedRecordInfoService;
	
	/**
	 * 初始化半全场数据
	 * @param result
	 * @param path
	 * @return
	 */
    public void initDoubleResultInfo(List<List<String>> result, String path, int flag) {
    	
    	insDoubleResultInfo(result, path);
    	storedRecordInfoService.updStoredRecordInfo(path);
    }
    
    /**
	 * 初始化半全场数据
	 * @param result
	 * @param path
	 * @return
	 */
    public void initDoubleResultInfo(List<List<String>> result, String path) {
    	insDoubleResultInfo(result, path);
    	storedRecordInfoService.saveStoredRecordInfo(path); 
    }
    
	/**
	 * 初始化半全场数据
	 * @param result
	 * @param path
	 * @return
	 */
	@RequestMapping(value = "/double", method = RequestMethod.POST)
    public String insDoubleResultInfo(List<List<String>> result, String path) {
		
		int i = 1;
		logger.info("初始化半全场数据" + path + " init start");
		long ss = System.currentTimeMillis();
		for(List<String> list : result){
			String season = FormatUtil.seasonFormat(list.get(0));
			String round = FormatUtil.roundFormat(list.get(1));
			String match = FormatUtil.matchFormat(list.get(0), matchList);
			String team_home = FormatUtil.teamFormat(list.get(3), teamList);
			String team_away = FormatUtil.teamFormat(list.get(5), teamList);
			String company = FormatUtil.companyFormat(list.get(7), companyList);
			float homeHome = FormatUtil.oddsFormat(list.get(8));
			float homeDraw = FormatUtil.oddsFormat(list.get(9));
			float homeAway = FormatUtil.oddsFormat(list.get(10));
			float drawHome = FormatUtil.oddsFormat(list.get(11));
			float drawDraw = FormatUtil.oddsFormat(list.get(12));
			float drawAway = FormatUtil.oddsFormat(list.get(13));
			float awayHome = FormatUtil.oddsFormat(list.get(14));
			float awayDraw = FormatUtil.oddsFormat(list.get(15));
			float awayAway = FormatUtil.oddsFormat(list.get(16));

			String doubleResultId = match + "_" + team_home + "_" + team_away + "_" + season + "_" + round;
			doubleResultInfo.setDoubleResultId(doubleResultId);
			doubleResultInfo.setCompany(company);
			doubleResultInfo.setHomeHome(homeHome);
			doubleResultInfo.setHomeDraw(homeDraw);
			doubleResultInfo.setHomeAway(homeAway);
			doubleResultInfo.setDrawHome(drawHome);
			doubleResultInfo.setDrawDraw(drawDraw);
			doubleResultInfo.setDrawAway(drawAway);
			doubleResultInfo.setAwayHome(awayHome);
			doubleResultInfo.setAwayDraw(awayDraw);
			doubleResultInfo.setAwayAway(awayAway);
			 
			//插入半全场数据
			doubleResultInfoService.saveDoubleResultInfo(doubleResultInfo);
			i++;
		
		}
		
		long ee = System.currentTimeMillis();
		logger.info("全部共花费:" +  (ee-ss) + "秒,共" + i + "条");
		storedRecordInfoService.saveStoredRecordInfo(path);
		return path + " has init complete!";
	}
}
