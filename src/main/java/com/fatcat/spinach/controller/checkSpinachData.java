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

import com.fatcat.spinach.pojo.BallSizeInfo;
import com.fatcat.spinach.pojo.MatchBaseInfo;
import com.fatcat.spinach.pojo.TeamBaseInfo;
import com.fatcat.spinach.service.initDate.BallSizeInfoService;
import com.fatcat.spinach.service.initDate.DoubleResultInfoService;
import com.fatcat.spinach.service.initDate.MatchBaseInfoService;
import com.fatcat.spinach.service.initDate.MatchResultInfoService;
import com.fatcat.spinach.service.initDate.PlateAsianInfoService;
import com.fatcat.spinach.service.initDate.PlateEuropeInfoService;
import com.fatcat.spinach.service.initDate.TeamBaseInfoService;
import com.fatcat.spinach.utils.ExcelUtil;
import com.fatcat.spinach.utils.FormatUtil;

/**
 * 初始化基础数据用
 * @author fatcat
 *
 */
@RestController
@RequestMapping
public class checkSpinachData {
	
	private final static Logger logger = LoggerFactory.getLogger(checkSpinachData.class);
	
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
	MatchBaseInfoService matchBaseInfoService;
	
	@Autowired
	TeamBaseInfoService teamBaseInfoService;
	
	/**
	 * 检查轮次数据
	 * @return
	 */
	@RequestMapping(value = "/checkB", method = RequestMethod.GET)
    public String checkBallSizeInfo() {
		logger.debug("run in checkData");
		
		List<MatchBaseInfo> matchList = matchBaseInfoService.queryMatchBaseInfoList();
		String re = "";
		String ballSizeC = "大小球数据:<br>";
		
		long ss = System.currentTimeMillis();
		for(MatchBaseInfo info : matchList) {
			String matchId = info.getMatchBaseId();
			String matchName = info.getMatchName();
			for(int s=15; s<18; s++) {
				for(int r=1; r<39; r++) {
					String round = String.valueOf(s) + "_" + String.valueOf(r);
					int bc = ballSizeInfoService.countBallSizeInfoLikeMatchAndRound(matchId, round);
					if(bc != 0) {
						ballSizeC += matchName + "," + s + "," + r + "," + bc + "<br>";
						logger.info(matchName + "," + s + "," + r + "," + bc + "<br>");
					}
				}
			}
			
		}
		re = ballSizeC + "<br>";
		long ee = System.currentTimeMillis();
		logger.info("全部共花费:" +  (ee-ss) + "秒");
		return re;
	}
	
	/**
	 * 检查轮次数据
	 * @return
	 */
	@RequestMapping(value = "/checkA", method = RequestMethod.GET)
    public String checkPlateAsianInfo() {
		logger.debug("run in checkData");
		
		List<MatchBaseInfo> matchList = matchBaseInfoService.queryMatchBaseInfoList();
		String re = "";
		String plateAsianC = "压盘数据:<br>";
		
		long ss = System.currentTimeMillis();
		for(MatchBaseInfo info : matchList) {
			String matchId = info.getMatchBaseId();
			String matchName = info.getMatchName();
			for(int s=15; s<18; s++) {
				for(int r=1; r<39; r++) {
					String round = String.valueOf(s) + "_" + String.valueOf(r);
					int ac = plateAsianInfoService.countPlateAsianInfoLikeMatchAndRound(matchId, round);
					if(ac != 0) {
						plateAsianC += matchName + "," + s + "," + r + "," + ac + "<br>";
						logger.info(matchName + "," + s + "," + r + "," + ac + "<br>");
					}
				}
			}
			
		}
		re = plateAsianC + "<br>";
		long ee = System.currentTimeMillis();
		logger.info("全部共花费:" +  (ee-ss) + "秒");
		return re;
	}
	
	/**
	 * 检查轮次数据
	 * @return
	 */
	@RequestMapping(value = "/checkE", method = RequestMethod.GET)
    public String checkPlateEuropeInfo() {
		logger.debug("run in checkData");
		
		List<MatchBaseInfo> matchList = matchBaseInfoService.queryMatchBaseInfoList();
		String re = "";
		String plateEuropeC = "欧赔数据:<br>";
		
		long ss = System.currentTimeMillis();
		for(MatchBaseInfo info : matchList) {
			String matchId = info.getMatchBaseId();
			String matchName = info.getMatchName();
			for(int s=15; s<18; s++) {
				for(int r=1; r<39; r++) {
					String round = String.valueOf(s) + "_" + String.valueOf(r);
					int ec = plateEuropeInfoService.countPlateEuropeInfoLikeMatchAndRound(matchId, round);
					if(ec != 0) {
						plateEuropeC += matchName + "," + s + "," + r + "," + ec + "<br>";
						logger.info(matchName + "," + s + "," + r + "," + ec + "<br>");
					}
				}
			}
		}
		re = plateEuropeC + "<br>";
		long ee = System.currentTimeMillis();
		logger.info("全部共花费:" +  (ee-ss) + "秒");
		return re;
	}
	
	/**
	 * 检查轮次数据
	 * @return
	 */
	@RequestMapping(value = "/checkD", method = RequestMethod.GET)
    public String checkDoubleResultInfo() {
		logger.debug("run in checkData");
		
		List<MatchBaseInfo> matchList = matchBaseInfoService.queryMatchBaseInfoList();
		String re = "";
		String doubleResultC = "半全场数据:<br>";
		
		long ss = System.currentTimeMillis();
		for(MatchBaseInfo info : matchList) {
			String matchId = info.getMatchBaseId();
			String matchName = info.getMatchName();
			for(int s=15; s<18; s++) {
				for(int r=1; r<39; r++) {
					String round = String.valueOf(s) + "_" + String.valueOf(r);
					int dc = doubleResultInfoService.countDoubleResultInfoLikeMatchAndRound(matchId, round);
					if(dc != 0) {
						doubleResultC += matchName + "," + s + "," + r + "," + dc + "<br>";
						logger.info(matchName + "," + s + "," + r + "," + dc + "<br>");
					}
				}
			}
			
		}
		re = doubleResultC + "<br>";
		long ee = System.currentTimeMillis();
		logger.info("全部共花费:" +  (ee-ss) + "秒");
		return re;
	}
	
	/**
	 * 检查大小球为null的数据
	 * @return
	 */
	@RequestMapping(value = "/checkNull/b", method = RequestMethod.GET)
    public String checkDataNullB() {
		logger.debug("run in checkDataNull");
		
		List<MatchBaseInfo> matchList = matchBaseInfoService.queryMatchBaseInfoList();
		List<TeamBaseInfo> teamList = teamBaseInfoService.queryTeamBaseInfoList();
		String re = "大小球为空数据：";
		
		long ss = System.currentTimeMillis();
		List<BallSizeInfo> bsi = ballSizeInfoService.queryBallSizeInfoLikeNull();
		
		for(BallSizeInfo info : bsi){
			String id = info.getBallSizeId();
			String[] ids = id.split("_");
			if("null".equals(ids[1]) || null == ids[1]) {
				
			}else
			if("null".equals(ids[2]) || null == ids[2]) {
				
			}else
			if("null".equals(ids[3]) || null == ids[3]) {
				
			}else
			if("null".equals(ids[4]) || null == ids[4]) {
				
			}else
			if("null".equals(ids[5]) || null == ids[5]) {
				
			}
	}
		long ee = System.currentTimeMillis();
		logger.info("全部共花费:" +  (ee-ss) + "秒");
		return re;
	}
	
	private String nullCheck(String info) {
		
		List<MatchBaseInfo> matchList = matchBaseInfoService.queryMatchBaseInfoList();
		List<TeamBaseInfo> teamList = teamBaseInfoService.queryTeamBaseInfoList();
		
		String re = "";
		String[] ids = info.split("_");
		String match = " ";
		String home = " ";
		String away = " ";
		String season = " ";
		String round = " ";
		if("null".equals(ids[1]) || null == ids[1]) {
			
		}else{
			
			match = FormatUtil.matchFormat(ids[1], matchList);
		}
		if("null".equals(ids[2]) || null == ids[2]) {
			
		}else
		if("null".equals(ids[3]) || null == ids[3]) {
			
		}else
		if("null".equals(ids[4]) || null == ids[4]) {
			
		}else
		if("null".equals(ids[5]) || null == ids[5]) {
			
		}
		
		return re;
	}
	
	@RequestMapping(value = "/checkTitle", method = RequestMethod.POST)
    public String checkTitle(@RequestParam("path") String path){

		String re = "";
		ExcelUtil excelUtil = new ExcelUtil();
    	Object ob = excelUtil.getPath(path);
    	try{
			if(ob instanceof String) {		
	    	
			re += path + "<br>";
	    	if(path.contains("欧赔")){
	    		List<List<String>> result = excelUtil.readXlsxForTitel(path);
	    		re += result + "<br>";
	    		logger.info(re);
	    	}
			}else {
				File f = (File) ob;
				File[] tempList = f.listFiles();
				for(File ff : tempList) {
					String newPath = ff.getAbsolutePath();
					if(ob instanceof String) {
						re += path + "<br>";
			        	if(path.contains("欧赔")){
			        		List<List<String>> result = excelUtil.readXlsxForTitel(path);
			        		re += result + "<br>";
			        		logger.info(re);
			        	}
					}else {
						checkTitle(newPath);
					}
				}
			}	
    	}catch(Exception e) {
    		logger.error(path + "excel read has an error!" + e);
    	}
    	return re;
	}
	
}
