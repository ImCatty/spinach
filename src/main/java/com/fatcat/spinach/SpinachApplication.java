package com.fatcat.spinach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;


//扫描mybatis mapper包路径
@MapperScan(value = "com.fatcat.spinach.mapper")
//@ComponentScan(basePackages = {"com.fatcat.spinach.pojo.controller"})
@SpringBootApplication
public class SpinachApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpinachApplication.class, args);
	}
}
