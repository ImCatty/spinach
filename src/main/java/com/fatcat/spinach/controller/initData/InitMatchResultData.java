package com.fatcat.spinach.controller.initData;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fatcat.spinach.pojo.MatchResultInfo;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.service.initDate.MatchResultInfoService;
import com.fatcat.spinach.service.initDate.StoredRecordInfoService;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化比赛结果信息数据用
 * @author fatcat
 *
 */
@Controller
public class InitMatchResultData extends InitBaseDataInfo{
	
	private final static Logger logger = LoggerFactory.getLogger(InitMatchResultData.class);
	
	@Autowired
	MatchResultInfo matchResultInfo;
	
	@Autowired
	MatchResultInfoService matchResultInfoService;
	
	@Autowired
	StoredRecord storedRecord;
	
	@Autowired
	StoredRecordInfoService storedRecordInfoService;
	
	/**
	 * 初始化比赛结果信息表
	 * @param result
	 * @param path
	 * @return
	 */
    public void initMatchResultInfo(List<List<String>> result, String path, int flag) {
    	
    	insMatchResultInfo(result, path);
    	storedRecordInfoService.updStoredRecordInfo(path);
    }
    
    /**
	 * 初始化比赛结果信息表
	 * @param result
	 * @param path
	 * @return
	 */
    public void initMatchResultInfo(List<List<String>> result, String path) {
    	insMatchResultInfo(result, path);
    	storedRecordInfoService.saveStoredRecordInfo(path); 
    }
    
	/**
	 * 初始化比赛结果信息表
	 * @param result
	 * @param path
	 * @return
	 */
    private String insMatchResultInfo(List<List<String>> result, String path) {
		
		int i = 1;
		logger.info("初始化比赛结果信息表" + path + path + " init start");
		long ss = System.currentTimeMillis();
			for(List<String> list : result){
				String season = FormatUtil.seasonFormat(list.get(0));
				String round = FormatUtil.roundFormat(list.get(1));
				String match = FormatUtil.matchFormat(list.get(0), matchList);
				String team_home = FormatUtil.teamFormat(FormatUtil.spaceFormat(list.get(3)), teamList);
				String team_away = FormatUtil.teamFormat(FormatUtil.spaceFormat(list.get(6)), teamList);
				
				ArrayList<Integer> re = FormatUtil.resultFormat(list.get(5), list.get(4));
				int halfHomeGoals = re.get(0);
				int halfAwayGoals = re.get(1);
				int wholeHomeGoals = re.get(2);
				int wholeAwayGoals = re.get(3);
				String halfResult = list.get(5);
				String wholeResult = list.get(4);

				String matchResultId = match + "_" + team_home + "_" + team_away + "_" + season + "_" + round;
				
				matchResultInfo.setMatchResultId(matchResultId);
				matchResultInfo.setHalfHomeGoals(halfHomeGoals);
				matchResultInfo.setHalfAwayGoals(halfAwayGoals);
				matchResultInfo.setWholeHomeGoals(wholeHomeGoals);
				matchResultInfo.setWholeAwayGoals(wholeAwayGoals);
				matchResultInfo.setHalfResult(halfResult);
				matchResultInfo.setWholeResult(wholeResult);
				 
				//插入欧赔数据
				matchResultInfoService.saveMatchResultInfo(matchResultInfo);
				i++;
    		
			}
			long ee = System.currentTimeMillis();
    		logger.info("全部共花费:" +  (ee-ss) + "秒,共" + i + "条");
    		storedRecordInfoService.saveStoredRecordInfo(path);
    		return path + " has init complete!";
	}
}
