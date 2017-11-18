package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Emp;

public interface EmpService{
		//List<Emp> findByName(String ename);
		List<Emp> findEmps();
		boolean saveEmp(Emp e);
		boolean delEmp(Integer deptno);
		boolean updateEmp(Emp e,Integer empno);
		public Emp jqfindEmp(Integer empno);
		public List<Emp> mhfindEmp(String ename);
}
