package com.company.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dao.pojo.Login;
import com.company.service.iservice.LoginService;

@Controller
@RequestMapping("user1")
public class UserAction {

	// 1-取值
	private LoginService loginService;	
		
	@Resource(name="loginService")	
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	// 2-处理
	
	@RequestMapping(value="login1.do",method=RequestMethod.POST)	
	public String login(Login login,Model model) {	
		String msg = "error";
		Login login1 = loginService.login(login);	
		System.out.println(login1);
		if(login1!=null){
			model.addAttribute("username", login1.getUsername());
		    return "redirect:/emp/emps1.do";
		}		
		return msg;
	}
	
	/*@RequestMapping(value="registry.do",method=RequestMethod.POST)
	public String registry() {
		loginService.registry(userModel);
		return "redirect:/index.jsp";
	}*/
	
	@RequestMapping(value="tiaozhuan.do")
	public String tiaozhuan(){
		return "registry.jsp";
	}
}