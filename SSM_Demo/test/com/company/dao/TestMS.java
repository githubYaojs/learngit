package com.company.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.idao.LoginDao;
import com.company.dao.pojo.Login;
import com.company.service.iservice.LoginService;

public class TestMS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		LoginDao ld = app.getBean(LoginDao.class);
		Login ln = new Login("root","1");
		Login l2 = ld.login(ln);
		System.out.println(l2);

		LoginService ls = app.getBean(LoginService.class);
		Login l = ls.login(ln);
		
		System.out.println(l);
	}

}
