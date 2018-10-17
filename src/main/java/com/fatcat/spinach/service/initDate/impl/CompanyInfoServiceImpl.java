package com.fatcat.spinach.service.initDate.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fatcat.spinach.mapper.CompanyInfoMapper;
import com.fatcat.spinach.pojo.CompanyInfo;
import com.fatcat.spinach.service.initDate.CompanyInfoService;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService{
	
	private static Logger logger = Logger.getLogger(CompanyInfoServiceImpl.class);
	
	@Autowired
	CompanyInfoMapper companyInfoMapper;
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<CompanyInfo> queryCompanyInfoList() {
		// TODO Auto-generated method stub
		
		logger.debug("run in queryCompanyInfoList");
		List<CompanyInfo> re = companyInfoMapper.selectAll();
		return re;
	}

}
