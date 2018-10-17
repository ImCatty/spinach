package com.fatcat.spinach.controller;

import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fatcat.spinach.controller.initData.InitBallSizeData;
import com.fatcat.spinach.controller.initData.InitBaseDataInfo;
import com.fatcat.spinach.controller.initData.InitDoubleResultData;
import com.fatcat.spinach.controller.initData.InitMatchData;
import com.fatcat.spinach.controller.initData.InitMatchResultData;
import com.fatcat.spinach.controller.initData.InitPlateAsianData;
import com.fatcat.spinach.controller.initData.InitPlateEuropeData;
import com.fatcat.spinach.controller.initData.InitPlateLetData;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.service.initDate.StoredRecordInfoService;
import com.fatcat.spinach.utils.ExcelUtil;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化基础数据用
 * @author fatcat
 *
 */
@RestController
@RequestMapping("/init")
public class initSpinachData {
	
	private final static Logger logger = LoggerFactory.getLogger(initSpinachData.class);
	
	@Autowired
	StoredRecord storedRecord;
	
	@Autowired
	StoredRecordInfoService storedRecordInfoService;
	
	@Autowired
	InitBaseDataInfo initBaseDataInfo;
	
	@Autowired
	InitBallSizeData initBallSizeData;
	
	List<StoredRecord> storedRecordlist;
	
	/**
	 * 初始化数据
	 * @param path
	 * @throws Exception
	 */
	@RequestMapping(value = "/initData", method = RequestMethod.POST)
    public void initData(@RequestParam("path") String path){

		initBaseDataInfo.initBaseData();
		storedRecordlist = storedRecordInfoService.queryStoredRecord();
		ExcelUtil excelUtil = new ExcelUtil();
    	Object ob = excelUtil.getPath(path);
    	try{
			if(ob instanceof String) {		
		    	List<List<String>> result = excelUtil.readXlsx(path);
		    	excInitData(path, result);
			}else {
				File f = (File) ob;
				File[] tempList = f.listFiles();
				for(File ff : tempList) {
					String newPath = ff.getAbsolutePath();
					if(ob instanceof String) {
						List<List<String>> result = excelUtil.readXlsx(newPath);
		    			excInitData(newPath, result);
					}else {
						initData(newPath);
					}
				}
			}
    	}catch(Exception e) {
    		logger.error("excel read has an error!" + e);
    	}
	}
	
	/**
	 * 
	 * @param path
	 * 			excel路径
	 * @param list
	 * 			excel内容
	 */
	private void excInitData(String path, List<List<String>> list){
		
		File f = new File(path);
		String fileName = f.getName();
		boolean flag = FormatUtil.checkStoreStatus(fileName, storedRecordlist);
		if(!flag) {
			if(path.contains("大小球")) {
				
				initBallSizeData.initBallSizeInfo(list, path);
				
			}else if(path.contains("欧赔")) {
				
				new InitPlateEuropeData().initPlateEuropeInfo(list, path);
				
			}else if(path.contains("亚盘")) {
				
				new InitPlateAsianData().initPlateAsianInfo(list, path);
				
			}else if(path.contains("让球盘数据")) {
				
				new InitPlateLetData().initPlateLetInfo(list, path);
						
			}else if(path.contains("半全场数据")) {
				
				new InitDoubleResultData().initDoubleResultInfo(list, path);
				new InitMatchData().initMatchInfo(list, path);
				
			}else if(path.contains("半全场比分数据")) {
				
				new InitMatchResultData().initMatchResultInfo(list, path);
				
			}
		}else {
			logger.info(fileName + "has already inited");
		}
		
	}
	
	public boolean checkStoreStatus(String excelName) {
		
		boolean flag = storedRecordInfoService.queryStoredRecordInfo(excelName);;
		return flag;
	}
}
