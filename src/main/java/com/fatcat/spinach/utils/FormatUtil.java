package com.fatcat.spinach.utils;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fatcat.spinach.pojo.CompanyInfo;
import com.fatcat.spinach.pojo.MatchBaseInfo;
import com.fatcat.spinach.pojo.StoredRecord;
import com.fatcat.spinach.pojo.TeamBaseInfo;

public class FormatUtil {
	
	private final static Logger logger = LoggerFactory.getLogger(FormatUtil.class);

	public static String matchFormat(String match, List<MatchBaseInfo> matchList) {
    	
    	logger.debug("----matchFormat start----");
    	String re = null;
    	for(MatchBaseInfo info : matchList) {
    		
    		if(match.contains(info.getMatchName())) {
    			re = info.getMatchBaseId();
    		}else {
    			logger.debug("not found 【" + match + "】 in datebase table");
    		}
    	}
    	logger.debug("----matchFormat end----");
		return re;
    }
    
    public static String seasonFormat(String season) {
    	
    	logger.debug("----seasonFormat start----");
    	if("".equals(season)) {
    		;
    	}else {
    		if(season.contains("/")) {
        		season = season.substring(3, 5);
        	}else{
        		season = season.substring(0, 2);
        	}
    	}
    	
    	logger.debug("----seasonFormat end----");
    	return season;
    }
    
    public static String roundFormat(String round) {
    	
    	logger.debug("----roundFormat start----");
    	Pattern pattern = Pattern.compile("\\d+");
  	    Matcher matcher = pattern.matcher(round);
  	    String re = null;
  	    if(matcher.find()){
  	    	re = matcher.group();
  	    }else {
  	    	logger.debug("sth error when found 【" + round + "】  ");
  	    }
  	    logger.debug("----roundFormat end----");
  	    return re;
	}
    
    public static String teamFormat(String team, List<TeamBaseInfo> teamList) {
    	
    	logger.debug("----teamFormat start----");
    	
    	String re = null;
    	
    	for(TeamBaseInfo info : teamList) {
		    
    		if(info.getTeamName().equals(team)) {
    			re = info.getTeamBaseId();
	    	}else {
	    		logger.debug("not found 【" + team + "】 in datebase table");
	    	}
	    }
    	logger.debug("----teamFormat end----");
		return re;
    }
    
    public static String teamFormatForResult(String team, List<TeamBaseInfo> teamList) {
    	
    	logger.debug("----teamFormatForResult start----");
    	
    	String re = null;
    	
    	for(TeamBaseInfo info : teamList) {
		    
    		if(info.getTeamName().contains(team)) {
    			re = info.getTeamBaseId();
	    	}else {
	    		logger.debug("not found 【" + team + "】 in datebase table");
	    	}
	    }
    	logger.debug("----teamFormatForResult end----");
		return re;
    }
    
    public static String companyFormat(String company, List<CompanyInfo> companyList) {
    	
    	logger.debug("----companyFormat start----");
    	
    	String re = null;
    	for(CompanyInfo info : companyList) {
    		
    		if(company.equals(info.getCompanyName())) {
    			re = info.getCompanyId().toString();
    		}else {
    			logger.debug("not found 【" + company + "】 in datebase table");
    		}
    	}
    	
    	logger.debug("----companyFormat end----");
    	
		return re;
    }
    
    public static float doubleFormat(String str) {
		
		logger.debug("----doubleFormat start----");
		float re = 0;
		if(str.contains("↑")) {
			str = str.substring(0, str.indexOf("↑"));
    	}else
    	if(str.contains("↓")) {
    		str = str.substring(0, str.indexOf("↓"));
    	}
		if(str.contains("/")) {
			float s =  Float.parseFloat(str.substring(0, str.indexOf("/")));
			float e =  Float.parseFloat(str.substring(str.indexOf("/")+1, str.length()));
			re = (s + e)/2;
    	}else if("".equals(str) || null == str){
    		re = 0;
    	}else {
    		re = Float.parseFloat(str);
    	}
		
		logger.debug("----doubleFormat end----");
		
		return re;
	}
    
    public static float asianFormat(String str) {
		
		logger.debug("----asianFormat start----");
		float re = 0;
		if(str.contains("升")) {
			str = str.substring(0, str.indexOf("升")).trim();
    	}else
    	if(str.contains("降")) {
    		str = str.substring(0, str.indexOf("降")).trim();
    	}
		if(str.contains("↑")) {
			str = str.substring(0, str.indexOf("↑"));
    	}else
    	if(str.contains("↓")) {
    		str = str.substring(0, str.indexOf("↓"));
    	}
		float pre = -1;
		float suf = 1;
		if(str.contains("受")) {
			str =  str.substring(str.indexOf("受")+1, str.length());
			pre = 1;
		}
		
		switch(str){
			case "平手":
				suf = 0;
				break;
			case "平手/半球":
				suf = (float) 0.25;
				break;
			case "半球":
				suf = (float) 0.5;
				break;
			case "半球/一球":
				suf = (float) 0.75;
				break;
			case "一球":
				suf = 1;
				break;
			case "一球/球半":
				suf = (float) 1.25;
				break;
			case "球半":
				suf = (float) 1.5;
				break;
			case "球半/两球":
				suf = (float) 1.75;
				break;
			case "两球":
				suf = 2;
				break;
			case "两球/两球半":
				suf = (float) 2.25;
				break;
			case "两球半":
				suf = (float) 2.5;
				break;
			case "两球半/三球":
				suf = (float) 2.75;
				break;
			case "三球":
				suf = 3;
				break;
			case "三球/三球半":
				suf = (float) 3.25;
				break;
			case "三球半":
				suf = (float) 3.5;
				break;
			case "三球半/四球":
				suf = (float) 3.75;
				break;
			case "四球":
				suf = 4;
				break;
			case "四球/四球半":
				suf = (float) 4.25;
				break;
			case "四球半":
				suf = (float) 4.5;
				break;
			case "四球半/五球":
				suf = (float) 4.75;
				break;
			case "五球":
				suf = 5;
				break;
		}
		re = pre * suf;
			
			
		if("".equals(str) || null == str){
    		re = 0;
    	}
		
		logger.debug("----asianFormat end----");
		
		return re;
	}
    
    public static float oddsFormat(String odds) {
    	
    	logger.debug("----oddsFormat start----");
    	if(odds.contains("↑")) {
    		odds = odds.substring(0, odds.indexOf("↑"));
    	}else
    	if(odds.contains("↓")) {
    		odds = odds.substring(0, odds.indexOf("↓"));
    	}
    	if("".equals(odds) || null == odds){
    		odds = "0";
    	}
    	logger.debug("----oddsFormat end----");
    	return Float.parseFloat(odds);
    }
    
    public static float presentFormat(String str) {
    	
    	logger.debug("----presentFormat start----");
    	
    	float re = 0;
    	if("".equals(str) || null == str){
    		re = 0;
    	}else {
    	
	    	NumberFormat nf = NumberFormat.getPercentInstance();
			Number m = 0;
			try {
				m = nf.parse(str);
			} catch (ParseException e) {
				
				logger.error("presentFormat has an error!" + e);
				e.printStackTrace();
			}
			re = m.floatValue();
	    	logger.debug("----presentFormat end----");
    	}
    	return re;
    }
    
    public static int standingsFormat(String str) {
    	
    	logger.debug("----standingsFormat start----");
    	
    	int re = 0;
    	if("".equals(str) || null == str){
    		re = 0;
    	}else {
    	
    		String st = "99";
    		if(str.contains("赛前排名")) {
    			st = str.substring(str.indexOf("赛前排名:")+5, str.length());
    			Pattern pattern = Pattern.compile("\\d+");
    	  	    Matcher matcher = pattern.matcher(st);
    	  	    if(matcher.find()){
    	  	    	st = matcher.group();
    	  	    }else {
    	  	    	logger.debug("sth error when found 【" + st + "】  ");
    	  	    }
    		}
			re = Integer.valueOf(st.trim());
	    	logger.debug("----standingsFormat end----");
    	}
    	return re;
    }
    
	public static Date timeFormat(String time) {
    	
    	logger.debug("----timeFormat start----");
    	Date date = new Date();   
        //注意format的格式要与日期String的格式相匹配   
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if(time.contains("比赛时间")) {
			time = time.substring(time.indexOf("比赛时间")+4, time.length()) + ":00";
		}
        try {   
           date = sdf.parse(time);   
        } catch (Exception e) {   
           e.printStackTrace();   
        } 
        logger.debug("----timeFormat start----");
         
		return date;
    }
	
	public static String spaceFormat(String str) {
		
		logger.debug("----spaceFormat start----");
		String re = str.trim().replaceAll("\\s*", "");
		
		logger.debug("----spaceFormat end----");
		return re;
	}
	
	public static ArrayList<Integer> resultFormat(String half, String whole) {
		
		logger.debug("----resultFormat start----");
		
		ArrayList<Integer> re = new ArrayList<Integer>();
		if("".equals(half) || null == half){
    		re.add(0);
    		re.add(0);
    	}else {
    		String[] sh = half.trim().split(":");
    		re.add(Integer.valueOf(sh[0]));
    		re.add(Integer.valueOf(sh[1]));
    	}
		if("".equals(whole) || null == whole){
    		re.add(0);
    		re.add(0);
    	}else {
    		String[] sw = whole.trim().split(":");
    		
    		re.add(Integer.valueOf(sw[0]));
    		re.add(Integer.valueOf(sw[1]));
    	}
		logger.debug("----resultFormat end----");
		return re;
	}
	
	public static boolean checkStoreStatus(String name, List<StoredRecord> storedRecordlist) {
		
		boolean re = false;
		for(StoredRecord info : storedRecordlist) {
	    		
    		if(name.equals(info.getRecordName())) {
    			re = true;
    		}else {
    			logger.debug("not found 【" + name + "】 in datebase table");
    		}
    	}
		return re;
	}
	
	public static String nullCheck(String str) {
		
		logger.debug("----nullCheck start----");
		String re = str;
		if(null == re) {
			re = "";
			logger.debug(str + "is nulll");
		}else
		if("".equals(re)) {
			logger.debug(str + "is ''");
		}
		
		logger.debug("----nullCheck end----");
		return re;
	}
	

	public static void main(String[] args) throws ParseException {
		
		String s1 = "1:2 ";
		String s2 = "1:1";
		ArrayList<Integer> ss = FormatUtil.resultFormat(s1, s2);
		System.out.println(ss);
	}
}
