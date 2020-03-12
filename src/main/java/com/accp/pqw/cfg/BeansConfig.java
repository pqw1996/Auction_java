package com.accp.pqw.cfg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = { "com.accp.pqw.dao" })
public class BeansConfig {
	

}
