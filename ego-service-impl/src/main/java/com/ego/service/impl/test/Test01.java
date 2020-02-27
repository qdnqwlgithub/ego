package com.ego.service.impl.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.ego.mapper.ItemMapper;

public class Test01 {
	public static void main(String[] args) throws SQLException {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
		String[] beanName=applicationContext.getBeanDefinitionNames();
		for(String s:beanName) {
			System.out.println(s);
		}
	}
}
