//package com.fatcat.spinach.controller;
//
//import java.io.File;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fatcat.spinach.pojo.BallSizeInfo;
//import com.fatcat.spinach.pojo.CompanyInfo;
//import com.fatcat.spinach.pojo.MatchBaseInfo;
//import com.fatcat.spinach.pojo.TeamBaseInfo;
//import com.fatcat.spinach.service.BallSizeInfoService;
//import com.fatcat.spinach.service.CompanyInfoService;
//import com.fatcat.spinach.service.MatchBaseInfoService;
//import com.fatcat.spinach.service.TeamBaseInfoService;
//import com.fatcat.spinach.utils.ExcelUtil;
//
//@RestController
//public class myStudy {
//	
//	private final static Logger logger = LoggerFactory.getLogger(myStudy.class);
// 
//	@Autowired
//	BallSizeInfoService ballSizeInfoService;
//	
//	@Autowired
//	BallSizeInfo ballSizeInfo;
//	
//	@Autowired
//	TeamBaseInfoService teamBaseInfoService;
//	
//	@Autowired
//	TeamBaseInfo teamBaseInfo;
//	
//	@Autowired
//	MatchBaseInfoService matchBaseInfoService;
//	
//	@Autowired
//	MatchBaseInfo matchBaseInfo;
//	
//	@Autowired
//	CompanyInfoService companyInfoService;
//	
//	@Autowired
//	CompanyInfo companyInfo;
//
//
////    @RequestMapping(value = "hi", method = RequestMethod.GET)
////    public String hello(@RequestParam("id") Integer muId) {
////
////        return "id = " + muId;
////    }
//    
//    @RequestMapping(value = "hi", method = RequestMethod.GET)
//    public String hello() {
//
//    	logger.info("hello info");
//    	logger.debug("hello debug");
//    	logger.error("hello error");
//        return "mySpringboot ";
//    }
//    
//    @RequestMapping(value = "ball", method = RequestMethod.GET)
//	public void ball() {
//    	
//    	ballSizeInfo.setCompany("韦德".toString());
////    	ballSizeInfo.setDoubleInitial(2.5);
////    	ballSizeInfo.setLessInitial(2.14);
////    	ballSizeInfo.setInitialTime(new Date("07-26 17:35"));
//    	try {
//    		ballSizeInfoService.saveBallSizeInfo(ballSizeInfo);
//			System.out.println("over");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
//    
//    @RequestMapping(value = "team", method = RequestMethod.GET)
//    public String team(@RequestParam("teamName") String name){
//    	
////    	TeamBaseInfo teamBaseInfo = teamBaseInfoService.queryTeamBaseInfoLikeName(name);
//    	
//    	String name_abb = teamBaseInfoService.queryTeamBaseInfoLikeName(name);
//    	
//    	return "name_abb = " + name_abb;
//    	
//    }
//    
//    @RequestMapping(value = "match", method = RequestMethod.GET)
//    public String match(@RequestParam("matchName") String name){
//    	
////    	TeamBaseInfo teamBaseInfo = teamBaseInfoService.queryTeamBaseInfoLikeName(name);
//    	
//    	String match_id = matchBaseInfoService.queryMatchBaseInfoLikeName(name);
//    	
//    	return "match_id = " + match_id;
//    	
//    }
//    
//    @RequestMapping(value = "initDate", method = RequestMethod.POST)
//    public String initDate(@RequestParam("path") String path) throws Exception {
//    	
//    	ExcelUtil excelUtil = new ExcelUtil();
//    	Object ob = excelUtil.getPath(path);
//    	List<TeamBaseInfo> teamList = teamBaseInfoService.queryTeamBaseInfoList();
//    	List<MatchBaseInfo> matchList = matchBaseInfoService.queryMatchBaseInfoList();
//    	List<CompanyInfo> companyList = companyInfoService.queryCompanyInfoList();
//    	
//    	if(ob instanceof String) {		
////            List<List<String>> result = excelUtil.readXlsx(path);
//    	}else {
//    		File f = (File) ob;
//    		 File[] tempList = f.listFiles();
//    		 int i = 1;
//    		 long ss = System.currentTimeMillis();
//    		 for(File ff : tempList) {
//    			 long s = System.currentTimeMillis();
//    			 String newPath = ff.getAbsolutePath();
//    			 List<List<String>> result = excelUtil.readXlsx(newPath);
//    			 for(List<String> list : result){
//    				 String season = seasonFormat(list.get(0));
//    				 String round = roundFormat(list.get(1));
//    				 String match = matchFormat(newPath, matchList);
//    				 String team_home = teamFormat(list.get(3), teamList);
//    				 String team_away = teamFormat(list.get(5), teamList);
//    				 String company = companyFormat(list.get(7), companyList);
//    				 String doubleInitial = list.get(13);
//    				 String moreInitial = oddsFormat(list.get(12));
//    				 String lessInitial = oddsFormat(list.get(14));
//    				 String doublePresence = oddsFormat(list.get(9));
//    				 String morePresence = oddsFormat(list.get(8));
//    				 String lessPresence = oddsFormat(list.get(10));
//    				 String initialTime = list.get(15);
//    				 String presenceTime = list.get(11);
//    				 String ballSizeId = match + "_" + team_home + "_" + team_away + "_" + season + "_" + round;
//    				 ballSizeInfo.setBallSizeId(ballSizeId);
//    				 ballSizeInfo.setCompany(company);
//    				 ballSizeInfo.setDoubleInitial(doubleInitial);
//    				 ballSizeInfo.setDoublePresence(doublePresence);
//    				 ballSizeInfo.setMoreInitial(moreInitial);
//    				 ballSizeInfo.setLessInitial(lessInitial);
//    				 ballSizeInfo.setMorePresence(morePresence);
//    				 ballSizeInfo.setLessPresence(lessPresence);
////    				 ballSizeInfo.setInitialTime(initialTime);
////    				 ballSizeInfo.setPresenceTime(presenceTime);
//    				 
//    				 try {
//    					 ballSizeInfoService.saveBallSizeInfo(ballSizeInfo);
//    					 System.out.println("第" + i + "条初始化完毕！");
//    					 i++;
//    				 } catch (Exception e) {
//    					 // TODO Auto-generated catch block
//    					 e.printStackTrace();
//    				 }
////    				 System.out.println("wait~~");
//    				
//    			 }
//    			 long e = System.currentTimeMillis();
//		         System.out.println(newPath + "Coast:" +  (e-s));
//    			
//    		 }
//    		 
//    		 long ee = System.currentTimeMillis();
//	         System.out.println("All coast:" +  (ee-ss));
//    	}
//    	return path + " has init complete!";
//    }
//
//    private String matchFormat(String match, List<MatchBaseInfo> matchList) {
//    	
//    	for(MatchBaseInfo info : matchList) {
//    		
//    		if(match.contains(info.getMatchName())) {
//    			return info.getMatchBaseId();
//    		}
//    	}
//		return null;
//    }
//    
//    private String seasonFormat(String season) {
//    	
//    	if(season.contains("/")) {
//    		season = season.substring(3, 5);
//    	}else{
//    		season = season.substring(0, 2);
//    	}
//    	return season;
//    }
//    
//    private String roundFormat(String round) {
//    	Pattern pattern = Pattern.compile("\\d+");
//  	    Matcher matcher = pattern.matcher(round);
//  	  
//  	    if(matcher.find()){
//  	    	return matcher.group();
//  	    }
//  	    else{
//  	    	return null;
//  	    }
//	}
//    
//    private String teamFormat(String team, List<TeamBaseInfo> teamList) {
//    	
//    	for(TeamBaseInfo info : teamList) {
//		    		
//    		if(team.contains(info.getTeamName())) {
//    			return info.getTeamBaseId();
//	    	}
//	    }
//		return null;
//    }
//    
//    private String companyFormat(String company, List<CompanyInfo> companyList) {
//    	
//    	for(CompanyInfo info : companyList) {
//    		
//    		if(company.contains(info.getCompanyName())) {
//    			return info.getCompanyId().toString();
//    		}
//    	}
//		return null;
//    }
//    
//    private String oddsFormat(String odds) {
//    	
//    	if(odds.contains("↑")) {
//    		odds = odds.substring(0, odds.indexOf("↑"));
//    	}else
//    	if(odds.contains("↓")) {
//    		odds = odds.substring(0, odds.indexOf("↓"));
//    	}
//    	return odds;
//    }
//    
//    private Date timeFormat(String time) {
//    	
//    	 Date date = new Date();   
//         //注意format的格式要与日期String的格式相匹配   
//         DateFormat sdf = new SimpleDateFormat("MM/dd HH:mm");  
//         try {   
//             date = sdf.parse(time);   
//         } catch (Exception e) {   
//             e.printStackTrace();   
//         } 
//         
//		return date;
//    	
//    }
//    
//    public static void main(String[] args) {
//    	 String sa = new String("14巴甲");
//    	  String sb = new String("16/17西甲");
//    	  String sc = new String("第1轮");
//    	  String sd = new String("2.5↓");
//    	  String se = new String("07-26 17:35");
//    	  
//    	  myStudy my = new myStudy();
//    	  
//    	  System.out.println(my.roundFormat(sc));
//    	  
//    	  Pattern pattern = Pattern.compile("\\d");
////    	  Pattern pattern = Pattern.compile("\\d+$");
//    	  Matcher matcher = pattern.matcher(sd);
//    	  
//    	  if(matcher.find()){
//    	   System.out.println("字符串sa是以数字结尾的，结尾的数字是："+matcher.group());
//    	  }
//    	  else{
//    	   System.out.println("字符串sa不是以数字结尾的");
//    	  }
//	}
//}
