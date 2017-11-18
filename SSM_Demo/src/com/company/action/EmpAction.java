package com.company.action;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;
import com.jspsmart.upload.Request;

@Controller
@RequestMapping("emp")
public class EmpAction {

	@Resource(name="empService")
	private EmpService empService;

	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	public EmpService getEmpService() {
		return empService;
	}

	//登录查询emps
	@RequestMapping(value="emps1.do")
	public String findAllEmps(Model model){
		List<Emp> emps= empService.findEmps();
		model.addAttribute("emps",emps);
		return "emp_details";		
	}
	
	//新增员工跳转
	@RequestMapping(value="tiao_save.do")
	public String tiaoSave(){
		return "emp_save";	
	}
	
	//保存员工
	@RequestMapping(value="save_emp.do",method=RequestMethod.POST)
	public String saveEmp(Emp emp){
		System.out.println("save ok");
		boolean b = empService.saveEmp(emp);
		if(b){
			return "redirect:/emp/emps1.do";	
		} 		
		return "error";		
	}
	
	/*删除*/
	@RequestMapping(value="del_emp.do",method=RequestMethod.GET)
	public String delEmpById(@RequestParam("empno")Integer empn){
		Boolean b = empService.delEmp(empn);
		if(b){
			return "redirect:/emp/emps1.do";
		}
		return "error";		
	}
	//修改跳转
	@RequestMapping(value="tiao_update.do",method=RequestMethod.GET)
	public String tiaoUpdate(HttpServletRequest request,Model model){
		String empno = request.getParameter("empno");
		Integer empn = Integer.parseInt(empno);
		model.addAttribute("eno", empn);
		return "emp_update";	
	}
	//修改
	@RequestMapping(value="update_emp.do",method=RequestMethod.POST)
	public String updateEmp(HttpServletRequest request,Emp e){
		System.out.println(e);		
		String empno = request.getParameter("eno");
		Integer empn = Integer.parseInt(empno);
		System.out.println(empn);
		Boolean b = empService.updateEmp(e, empn);
		if(b){
			return "redirect:/emp/emps1.do";
		}
		return "error";		
	}
	
	//精确查找
	@RequestMapping(value="jqfind_emp.do",method=RequestMethod.GET)
	public String jqfindEmp(@RequestParam("empno")Integer empno,Map<String,Object> map){
		Emp emp = empService.jqfindEmp(empno);
		if(emp!=null){
			map.put("emp111", emp);
			return "redirect:/emp/emps1.do";
		}		
		return "error";		
	}
	//模糊查询
	@RequestMapping(value="mhfind_emp.do",method=RequestMethod.POST)
	public String jqfindEmp(@RequestParam("ename")String ename,Map<String,Object> map){
		List<Emp> emps = empService.mhfindEmp(ename);
		if(emps!=null){
			map.put("emp222", emps);
			return "redirect:/emp/emps1.do";
		}		
		return "error";		
	}
	//路由单元
		@RequestMapping(value="report1.do")
		public String tiao_reportFromServer(){		
			return "reportFromServer.html";		
		}
		
}
