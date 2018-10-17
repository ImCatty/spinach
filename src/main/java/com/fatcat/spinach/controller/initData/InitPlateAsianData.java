package com.fatcat.spinach.controller.initData;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fatcat.spinach.pojo.PlateAsianInfo;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.service.initDate.PlateAsianInfoService;
import com.fatcat.spinach.service.initDate.StoredRecordInfoService;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化亚盘数据用
 * @author fatcat
 *
 */
@Controller
public class InitPlateAsianData extends InitBaseDataInfo{
	
	private final static Logger logger = LoggerFactory.getLogger(InitPlateAsianData.class);
	
	@Autowired
	PlateAsianInfo plateAsianInfo;
	
	@Autowired
	PlateAsianInfoService plateAsianInfoService;
	
	@Autowired
	StoredRecord storedRecord;
	
	@Autowired
	StoredRecordInfoService storedRecordInfoService;
	
	/**
	 * 初始化亚盘数据
	 * @param result
	 * @param path
	 * @return
	 */
    public void initPlateAsianInfo(List<List<String>> result, String path, int flag) {
    	
    	insPlateAsianInfo(result, path);
    	storedRecordInfoService.updStoredRecordInfo(path);
    }
    
    /**
	 * 初始化亚盘数据
	 * @param result
	 * @param path
	 * @return
	 */
    public void initPlateAsianInfo(List<List<String>> result, String path) {
    	insPlateAsianInfo(result, path);
    	storedRecordInfoService.saveStoredRecordInfo(path); 
    }
    
	/**
	 * 初始化亚盘数据
	 * @param result
	 * @param path
	 * @return
	 */
    private String insPlateAsianInfo(List<List<String>> result, String path) {
		
		int i = 1;
		logger.info("初始化亚盘数据" + path + " init start");
		long ss = System.currentTimeMillis();
			for(List<String> list : result){
				String season = FormatUtil.seasonFormat(list.get(0));
				String round = FormatUtil.roundFormat(list.get(1));
				String match = FormatUtil.matchFormat(list.get(0), matchList);
				String team_home = FormatUtil.teamFormat(list.get(3), teamList);
				String team_away = FormatUtil.teamFormat(list.get(5), teamList);
				String company = FormatUtil.companyFormat(list.get(7), companyList);
				float handicapInitial = FormatUtil.asianFormat(list.get(13));
				float upInitial = FormatUtil.oddsFormat(list.get(12));
				float downInitial = FormatUtil.oddsFormat(list.get(14));
				float handicapPresence = FormatUtil.asianFormat(list.get(9));
				float upPresence = FormatUtil.oddsFormat(list.get(8));
				float downPresence = FormatUtil.oddsFormat(list.get(10));

				String plateAsianId = match + "_" + team_home + "_" + team_away + "_" + season + "_" + round;
				plateAsianInfo.setPlateAsianId(plateAsianId);
				plateAsianInfo.setCompany(company);
				plateAsianInfo.setHandicapInitial(handicapInitial);
				plateAsianInfo.setUpInitial(upInitial);
				plateAsianInfo.setDownInitial(downInitial);
				plateAsianInfo.setHandicapPresence(handicapPresence);
				plateAsianInfo.setUpPresence(upPresence);
				plateAsianInfo.setDownPresence(downPresence);
				 
				//插入大小球数据
				plateAsianInfoService.savePlateAsianInfo(plateAsianInfo);
				i++;
    		 
			}
		long ee = System.currentTimeMillis();
   		logger.info("全部共花费:" +  (ee-ss) + "秒,共" + i + "条");
		storedRecordInfoService.saveStoredRecordInfo(path);
		return path + " has init complete!";
	}
}
