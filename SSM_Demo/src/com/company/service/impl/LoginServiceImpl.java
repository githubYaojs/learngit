package com.company.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.LoginDao;
import com.company.dao.pojo.Login;
import com.company.service.dto.vo.User;
import com.company.service.iservice.LoginService;

import jdk.nashorn.internal.ir.annotations.Reference;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	private LoginDao loginDao;
		
	@Resource(name="loginDao")
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	@Transactional
	@Override
	public Login login(Login login) {			
		Login msg = null;
		try {
			msg = loginDao.login(login);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return msg;
	}

	
	@Transactional
	@Override
	public String registry(User user) {
		String msg = "error";
		try {
			loginDao.registry(user.getLogin(), user.getDetail());
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

}
