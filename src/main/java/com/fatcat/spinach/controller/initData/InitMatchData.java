package com.fatcat.spinach.controller.initData;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fatcat.spinach.pojo.MatchInfo;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.service.initDate.MatchInfoService;
import com.fatcat.spinach.service.initDate.StoredRecordInfoService;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化比赛信息表数据用
 * @author fatcat
 *
 */
@Controller
public class InitMatchData extends InitBaseDataInfo{
	
	private final static Logger logger = LoggerFactory.getLogger(InitMatchData.class);
	
	@Autowired
	MatchInfo matchInfo;
	
	@Autowired
	MatchInfoService matchInfoService;
	
	@Autowired
	StoredRecord storedRecord;
	
	@Autowired
	StoredRecordInfoService storedRecordInfoService;
	
	/**
	 * 初始化比赛信息表
	 * @param result
	 * @param path
	 * @return
	 */
    public String initMatchInfo(List<List<String>> result, String path) {
		
		int i = 1;
		logger.info("初始化比赛信息表" + path + " init start");
		String matchIdOld = "";
		long ss = System.currentTimeMillis();
			for(List<String> list : result){
				String season = FormatUtil.seasonFormat(list.get(0));
				String round = FormatUtil.roundFormat(list.get(1));
				String match = FormatUtil.matchFormat(list.get(0), matchList);
				String team_home = FormatUtil.teamFormat(list.get(3), teamList);
				String team_away = FormatUtil.teamFormat(list.get(5), teamList);
				Date matchTime = FormatUtil.timeFormat(list.get(2));
				int homeStandings = FormatUtil.standingsFormat(list.get(4));
				int awayStandings = FormatUtil.standingsFormat(list.get(6));

				String matchIdNew = match + "_" + team_home + "_" + team_away + "_" + season + "_" + round;
				if(!matchIdNew.equals(matchIdOld)) {
					matchInfo.setMatchId(matchIdNew);
					matchInfo.setMatchTime(matchTime);
					matchInfo.setHomeStandings(homeStandings);
					matchInfo.setAwayStandings(awayStandings);
					 
					//插入欧赔数据
					matchInfoService.saveMatchInfo(matchInfo);
					matchIdOld = matchIdNew;
					i++;
				}
				
			}
			long ee = System.currentTimeMillis();
    		logger.info("全部共花费:" +  (ee-ss) + "秒,共" + i + "条");
    		return path + " has init complete!";
	}
}
