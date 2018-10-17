package com.fatcat.spinach.controller.initData;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fatcat.spinach.pojo.PlateEuropeInfo;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.service.initDate.PlateEuropeInfoService;
import com.fatcat.spinach.service.initDate.StoredRecordInfoService;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化欧赔数据用
 * @author fatcat
 *
 */
@Controller
public class InitPlateEuropeData extends InitBaseDataInfo{
	
	private final static Logger logger = LoggerFactory.getLogger(InitPlateEuropeData.class);
	
	@Autowired
	PlateEuropeInfo plateEuropeInfo;
	
	@Autowired
	PlateEuropeInfoService plateEuropeInfoService;
	
	@Autowired
	StoredRecord storedRecord;
	
	@Autowired
	StoredRecordInfoService storedRecordInfoService;
	
	/**
	 * 初始化欧赔数据
	 * @param result
	 * @param path
	 * @return
	 */
	 public void initPlateEuropeInfo(List<List<String>> result, String path) {

		 insPlateEuropeInfo(result, path);
		 storedRecordInfoService.saveStoredRecordInfo(path); 
	 }
	 
	 /**
		 * 初始化欧赔数据
		 * @param result
		 * @param path
		 * @return
		 */
		 public void initPlateEuropeInfo(List<List<String>> result, String path, int flag) {

			 insPlateEuropeInfo(result, path);
			 storedRecordInfoService.updStoredRecordInfo(path);
		 }
	 
	/**
	 * 插入欧赔数据
	 * @param result
	 * @param path
	 * @return
	 */
    private String insPlateEuropeInfo(List<List<String>> result, String path) {
		
		int i = 1;
		logger.info("初始化欧赔数据" + path + " init start");
		long ss = System.currentTimeMillis();
		for(List<String> list : result){
			String season = FormatUtil.seasonFormat(list.get(0));
			String round = FormatUtil.roundFormat(list.get(1));
			String match = FormatUtil.matchFormat(list.get(0), matchList);
			String team_home = FormatUtil.teamFormat(list.get(3), teamList);
			String team_away = FormatUtil.teamFormat(list.get(5), teamList);
			String company = FormatUtil.companyFormat(list.get(7), companyList);
			float winInitial = FormatUtil.oddsFormat(list.get(8));
			float drawInitial = FormatUtil.oddsFormat(list.get(9));
			float loseInitial = FormatUtil.oddsFormat(list.get(10));
			float kellyWinInitial = FormatUtil.oddsFormat(list.get(11));
			float kellyDrawInitial = FormatUtil.oddsFormat(list.get(12));
			float kellyLoseInitial = FormatUtil.oddsFormat(list.get(13));
			float returnInitial = FormatUtil.presentFormat(list.get(14));
			float winPresence = FormatUtil.oddsFormat(list.get(15));
			float drawPresence = FormatUtil.oddsFormat(list.get(16));
			float losePresence = FormatUtil.oddsFormat(list.get(17));
			float kellyWinPresence = FormatUtil.oddsFormat(list.get(18));
			float kellyDrawPresence = FormatUtil.oddsFormat(list.get(19));
			float kellyLosePresence = FormatUtil.oddsFormat(list.get(20));
			float returnPresence = FormatUtil.presentFormat(list.get(21));

			String planteEuropeId = match + "_" + team_home + "_" + team_away + "_" + season + "_" + round;
			plateEuropeInfo.setPlanteEuropeId(planteEuropeId);
			plateEuropeInfo.setCompany(company);
			plateEuropeInfo.setWinInitial(winInitial);
			plateEuropeInfo.setDrawInitial(drawInitial);
			plateEuropeInfo.setLoseInitial(loseInitial);
			plateEuropeInfo.setKellyWinInitial(kellyWinInitial);
			plateEuropeInfo.setKellyDrawInitial(kellyDrawInitial);
			plateEuropeInfo.setKellyLoseInitial(kellyLoseInitial);
			plateEuropeInfo.setWinPresence(winPresence);
			plateEuropeInfo.setDrawPresence(drawPresence);
			plateEuropeInfo.setLosePresence(losePresence);
			plateEuropeInfo.setKellyWinPresence(kellyWinPresence);
			plateEuropeInfo.setKellyDrawPresence(kellyDrawPresence);
			plateEuropeInfo.setKellyLosePresence(kellyLosePresence);
			plateEuropeInfo.setReturnInitial(returnInitial);
			plateEuropeInfo.setReturnPresence(returnPresence);
			 
			//插入欧赔数据
			plateEuropeInfoService.savePlateEuropeInfo(plateEuropeInfo);
			i++;
		
		}
		long ee = System.currentTimeMillis();
		logger.info("全部共花费:" +  (ee-ss) + "秒,共" + i + "条");
		return path + " has init complete!";
	}
}
