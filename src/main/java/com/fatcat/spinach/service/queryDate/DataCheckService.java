package com.fatcat.spinach.service.queryDate;


/**
 * 
 * @author fatcat
 *
 */
public interface DataCheckService {

	public void queryAllDataBySeason(String Season);
	
	public void queryAllDataByTeam(String teamName);
	
	public void queryAllDataByAsianOdds(float asianOdds);
	
	public void queryAllDataByEuropeOdds(float europeOdds);
	
	public void queryAllDataBySizeOdds(String sizeOdds);

	public void queryAllDataByHalfOdds(String halfOdds);
	
}
