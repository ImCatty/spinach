//package com.fatcat.spinach.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.fatcat.spinach.pojo.BallSizeInfo;
//import com.fatcat.spinach.service.BallSizeInfoService;
//import com.github.pagehelper.PageHelper;
//
//public class myTest {
//
//	@Autowired
//	BallSizeInfoService ballSizeInfoService;
//	
//	@Autowired
//	BallSizeInfo ballSizeInfo;
//	
//	@RequestMapping(value = "queryAll", method= RequestMethod.GET)
//	public void queryBallSizeInfo(@RequestParam("page") Integer pageNum, @RequestParam("size") Integer pageSize) {
//		
//		
////		PageHelper.startPage(pageNum, pageSize);
////		List<BallSizeInfo> list = ballSizeInfoService.queryBallSizeList();
//	}
//	
//}
