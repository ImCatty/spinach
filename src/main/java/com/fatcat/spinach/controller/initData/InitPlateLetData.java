package com.fatcat.spinach.controller.initData;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fatcat.spinach.pojo.PlateLetInfo;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.service.initDate.PlateLetInfoService;
import com.fatcat.spinach.service.initDate.StoredRecordInfoService;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化国彩让球盘数据用
 * @author fatcat
 *
 */
@Controller
public class InitPlateLetData extends InitBaseDataInfo{
	
	private final static Logger logger = LoggerFactory.getLogger(InitPlateLetData.class);
	
	@Autowired
	PlateLetInfo plateLetInfo;
	
	@Autowired
	PlateLetInfoService plateLetInfoService;
	
	@Autowired
	StoredRecord storedRecord;
	
	@Autowired
	StoredRecordInfoService storedRecordInfoService;
	
	/**
	 * 初始化国彩让球盘数据
	 * @param result
	 * @param path
	 * @return
	 */
    public void initPlateLetInfo(List<List<String>> result, String path, int flag) {
    	
    	insPlateLetInfo(result, path);
    	storedRecordInfoService.updStoredRecordInfo(path);
    }
    
    /**
	 * 初始化国彩让球盘数据
	 * @param result
	 * @param path
	 * @return
	 */
    public void initPlateLetInfo(List<List<String>> result, String path) {
    	insPlateLetInfo(result, path);
    	storedRecordInfoService.saveStoredRecordInfo(path); 
    }
    
	/**
	 * 初始化国彩让球盘数据
	 * @param result
	 * @param path
	 * @return
	 */
    private String insPlateLetInfo(List<List<String>> result, String path) {
		
		int i = 1;
		logger.info("初始化国彩让球盘数据" + path + " init start");
		long ss = System.currentTimeMillis();
		for(List<String> list : result){
			String season = FormatUtil.seasonFormat(list.get(0));
			String round = FormatUtil.roundFormat(list.get(1));
			String match = FormatUtil.matchFormat(list.get(0), matchList);
			String team_home = FormatUtil.teamFormat(list.get(3), teamList);
			String team_away = FormatUtil.teamFormat(list.get(5), teamList);
			String company = FormatUtil.companyFormat(list.get(7), companyList);
			int letPoint = 0;
			if(!"".equals(list.get(8))) {
				letPoint = Integer.valueOf(list.get(8));
			}
			float winInitial = FormatUtil.oddsFormat(list.get(9));
			float drawInitial = FormatUtil.oddsFormat(list.get(10));
			float loseInitial = FormatUtil.oddsFormat(list.get(11));
			float kellyWinInitial = FormatUtil.oddsFormat(list.get(12));
			float kellyDrawInitial = FormatUtil.oddsFormat(list.get(13));
			float kellyLoseInitial = FormatUtil.oddsFormat(list.get(14));
			float returnInitial = FormatUtil.presentFormat(list.get(15));
			float winPresence = FormatUtil.oddsFormat(list.get(16));
			float drawPresence = FormatUtil.oddsFormat(list.get(17));
			float losePresence = FormatUtil.oddsFormat(list.get(18));
			float kellyWinPresence = FormatUtil.oddsFormat(list.get(19));
			float kellyDrawPresence = FormatUtil.oddsFormat(list.get(20));
			float kellyLosePresence = FormatUtil.oddsFormat(list.get(21));
			float returnPresence = FormatUtil.presentFormat(list.get(22));

			String planteLetId = match + "_" + team_home + "_" + team_away + "_" + season + "_" + round;
			plateLetInfo.setPlanteLetId(planteLetId);
			plateLetInfo.setCompany(company);
			plateLetInfo.setLetPoint(letPoint);
			plateLetInfo.setWinInitial(winInitial);
			plateLetInfo.setDrawInitial(drawInitial);
			plateLetInfo.setLoseInitial(loseInitial);
			plateLetInfo.setKellyWinInitial(kellyWinInitial);
			plateLetInfo.setKellyDrawInitial(kellyDrawInitial);
			plateLetInfo.setKellyLoseInitial(kellyLoseInitial);
			plateLetInfo.setWinPresence(winPresence);
			plateLetInfo.setDrawPresence(drawPresence);
			plateLetInfo.setLosePresence(losePresence);
			plateLetInfo.setKellyWinPresence(kellyWinPresence);
			plateLetInfo.setKellyDrawPresence(kellyDrawPresence);
			plateLetInfo.setKellyLosePresence(kellyLosePresence);
			plateLetInfo.setReturnInitial(returnInitial);
			plateLetInfo.setReturnPresence(returnPresence);
			 
			//插入欧赔数据
			plateLetInfoService.savePlateLetInfo(plateLetInfo);
			i++;
		
		}
		long ee = System.currentTimeMillis();
		logger.info("全部共花费:" +  (ee-ss) + "秒,共" + i + "条");
		storedRecordInfoService.saveStoredRecordInfo(path);
		return path + " has init complete!";
	}
}
