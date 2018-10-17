package com.fatcat.spinach.controller.initData;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fatcat.spinach.service.initDate.BallSizeInfoService;
import com.fatcat.spinach.service.initDate.DoubleResultInfoService;
import com.fatcat.spinach.service.initDate.MatchInfoService;
import com.fatcat.spinach.service.initDate.MatchResultInfoService;
import com.fatcat.spinach.service.initDate.PlateAsianInfoService;
import com.fatcat.spinach.service.initDate.PlateEuropeInfoService;
import com.fatcat.spinach.service.initDate.PlateLetInfoService;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化前，删除重复数据用
 * @author fatcat
 *
 */
@Controller
public class BeforInitData extends InitBaseDataInfo{
	
	private final static Logger logger = LoggerFactory.getLogger(BeforInitData.class);
	
	@Autowired
	BallSizeInfoService ballSizeInfoService;
	
	@Autowired
	PlateAsianInfoService plateAsianInfoService;
	
	@Autowired
	PlateEuropeInfoService plateEuropeInfoService;
	
	@Autowired
	DoubleResultInfoService doubleResultInfoService;
	
	@Autowired
	MatchResultInfoService matchResultInfoService;
	
	@Autowired
	PlateLetInfoService plateLetInfoService;
	
	@Autowired
	MatchInfoService matchInfoService;
    
	/**
	 * 初始化大小球数据环境
	 * @param result
	 * @param path
	 * @return
	 */
    public void beforeInit(List<List<String>> result, String path) {
    	
    	logger.info(path + " init start");
		for(List<String> list : result){
			String season = FormatUtil.seasonFormat(list.get(0));
			String round = FormatUtil.roundFormat(list.get(1));
			String match = FormatUtil.matchFormat(path, matchList);
			String team_home = FormatUtil.teamFormat(list.get(3), teamList);
			String team_away = FormatUtil.teamFormat(list.get(5), teamList);
			String id = match + "_" + team_home + "_" + team_away + "_" + season + "_" + round;
			if(ballSizeInfoService.queryBallsizeInfoById(id) > 0) {
				ballSizeInfoService.deleteById(id);
			}else 
			if(plateAsianInfoService.queryPlateAsianInfoById(id) > 0) {
				plateAsianInfoService.deleteById(id);
			}else 
			if(plateEuropeInfoService.queryPlateEuropeInfoById(id) > 0) {
				plateEuropeInfoService.deleteById(id);
			}else 
			if(doubleResultInfoService.queryDoubleResultInfoById(id) > 0) {
				doubleResultInfoService.deleteById(id);
			}else 
			if(matchResultInfoService.queryMatchResultInfoById(id) > 0) {
				matchResultInfoService.deleteById(id);
			}else 
			if(plateLetInfoService.queryPlateLetInfoById(id) > 0) {
				plateLetInfoService.deleteById(id);
			}else 
			if(matchInfoService.queryMatchInfoById(id) > 0) {
				matchInfoService.deleteById(id);
			}
		}
    }
}
