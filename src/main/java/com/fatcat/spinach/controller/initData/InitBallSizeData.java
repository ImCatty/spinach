package com.fatcat.spinach.controller.initData;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fatcat.spinach.pojo.BallSizeInfo;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.service.initDate.BallSizeInfoService;
import com.fatcat.spinach.service.initDate.StoredRecordInfoService;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化大小球数据用
 * @author fatcat
 *
 */
@Controller
public class InitBallSizeData extends InitBaseDataInfo{
	
	private final static Logger logger = LoggerFactory.getLogger(InitBallSizeData.class);
	
	@Autowired
	BallSizeInfoService ballSizeInfoService;
	
	@Autowired
	BallSizeInfo ballSizeInfo;
	
	@Autowired
	StoredRecord storedRecord;
	
	@Autowired
	StoredRecordInfoService storedRecordInfoService;
	
	/**
	 * 初始化大小球数据
	 * @param result
	 * @param path
	 * @param flag 
	 * 					是否覆盖更新 1:覆盖更新 0:插入
	 * @return
	 */
    public void initBallSizeInfo(List<List<String>> result, String path, int flag) {
    	
    	insBallSizeInfo(result, path);
    	if(flag==1) {
    		storedRecordInfoService.updStoredRecordInfo(path);
    	}else 
    	if(flag==0) {
    		//插入大小球数据
			ballSizeInfoService.saveBallSizeInfo(ballSizeInfo);
    		storedRecordInfoService.saveStoredRecordInfo(path); 
    	}
    }
    
    /**
	 * 初始化大小球数据
	 * @param result
	 * @param path
	 * @return
	 */
    public void initBallSizeInfo(List<List<String>> result, String path) {
    	insBallSizeInfo(result, path);
    	storedRecordInfoService.saveStoredRecordInfo(path); 
    }
    
	/**
	 * 插入大小球数据
	 * @param result
	 * @param path
	 * @return
	 */
    private BallSizeInfo insBallSizeInfo(List<List<String>> result, String path) {
		
		int i = 1;
		logger.info(path + " init start");
		long ss = System.currentTimeMillis();
			for(List<String> list : result){
				String season = FormatUtil.seasonFormat(list.get(0));
				String round = FormatUtil.roundFormat(list.get(1));
				String match = FormatUtil.matchFormat(list.get(0), matchList);
				String team_home = FormatUtil.teamFormat(list.get(3), teamList);
				String team_away = FormatUtil.teamFormat(list.get(5), teamList);
				String company = FormatUtil.companyFormat(list.get(7), companyList);
				float doubleInitial = FormatUtil.doubleFormat(list.get(13));
				float moreInitial = FormatUtil.oddsFormat(list.get(12));
				float lessInitial = FormatUtil.oddsFormat(list.get(14));
				float doublePresence =  FormatUtil.doubleFormat(list.get(9));
				float morePresence = FormatUtil.oddsFormat(list.get(8));
				float lessPresence = FormatUtil.oddsFormat(list.get(10));
//    				String initialTime = list.get(15);
//    				String presenceTime = list.get(11);
				String ballSizeId = match + "_" + team_home + "_" + team_away + "_" + season + "_" + round;
				ballSizeInfo.setBallSizeId(ballSizeId);
				ballSizeInfo.setCompany(company);
				ballSizeInfo.setDoubleInitial(doubleInitial);
				ballSizeInfo.setDoublePresence(doublePresence);
				ballSizeInfo.setMoreInitial(moreInitial);
				ballSizeInfo.setLessInitial(lessInitial);
				ballSizeInfo.setMorePresence(morePresence);
				ballSizeInfo.setLessPresence(lessPresence);
//    				ballSizeInfo.setInitialTime(initialTime);
//    				ballSizeInfo.setPresenceTime(presenceTime);
				 
				
				
//				logger.info("第" + i + "条初始化完毕！");
				i++;
			 }
			 
    		 long ee = System.currentTimeMillis();
    		 logger.info("全部共花费:" +  (ee-ss) + "秒,共" + i + "条");
    		 return ballSizeInfo;
    }
}
