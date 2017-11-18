package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Emp;

public interface EmpDao extends BaseDao<Emp, Integer> {
	//List<Emp> findByName(String ename) throws Exception;
	public List<Emp> findEmps();
	public boolean saveEmp(Emp e);
	public boolean delEmp(Integer empno);
	public boolean updateEmp(Emp e,Integer empno);
	public Emp jqfindEmp(Integer empno);
	public List<Emp> mhfindEmp(String ename);
}