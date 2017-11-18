package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.idao.EmpDao;
import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;

@Service("empService")
public class EmpServiceImpl implements EmpService {

	@Resource(name="empDao")
	private EmpDao empDao;

	//查询
	@Override
	public List<Emp> findEmps() {
		// TODO Auto-generated method stub
		return empDao.findEmps();
	}

	@Override
	public boolean saveEmp(Emp e) {
		// TODO Auto-generated method stub
		Boolean fmg = false;
	    boolean e1 = empDao.saveEmp(e);
	    List<Emp> emps = empDao.findEmps();	  
	    if(e1){
	    	for(Emp es:emps){
		    	if(!es.getEname().equals(e.getEname())){
		    		fmg = true;
		    	}
		    }
	    }        
		return fmg;
	}
	//删除
	@Override
	public boolean delEmp(Integer empno) {
		// TODO Auto-generated method stub
		boolean fmg = false;
		boolean p = empDao.delEmp(empno);
		if(p){
			fmg = true;
		}
		return fmg;
	}
	//修改
	@Override
	public boolean updateEmp(Emp e,Integer empno){
		// TODO Auto-generated method stub
		boolean fmg = false;
		
		boolean p = empDao.updateEmp(e,empno);
		if(p){
			e.setEmpno(empno);
			fmg = true;
		}
		return fmg;
	}

	@Override
	public Emp jqfindEmp(Integer empno) {
		// TODO Auto-generated method stub
		Emp e = empDao.jqfindEmp(empno);
		return e;
	}

	@Override
	public List<Emp> mhfindEmp(String ename) {
		// TODO Auto-generated method stub
		List<Emp> emps = empDao.mhfindEmp(ename);
		return emps;
	}




}
