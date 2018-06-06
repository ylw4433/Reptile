package com.reptile.code.controller;
/***********************************************
*
*@Description:登录
*@author:  yaolewei <br/>
*@date：2018年5月17日
*
***********************************************/

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.reptile.code.entity.UserInfo;
import com.reptile.code.server.login.LoginServer;
import com.reptile.code.server.login.LoginServerImpl;

@RequestMapping()
@Controller
public class LoginController {

	@Autowired
	private LoginServer loginServer;
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(UserInfo user) {
		user.setUsername("lewei");
		user.setPassword("123456");
		UserInfo log_UserInfo = loginServer.login(user);
		return log_UserInfo.getUsername().toString();
	}
	
	

	
	@RequestMapping("/login2")
	@ResponseBody
	public String login2() {
		String result = "qwe";
		
		return result;
	}
	
	
	
	 @RequestMapping(value="/hello")
     public ModelAndView hello(){
         // 创建准备返回的ModelAndView对象，该对象通常包含了返回视图的路径、模型的名称以及模型对象
         ModelAndView mv = new ModelAndView();
         //添加模型数据 可以是任意的POJO对象  
         mv.addObject("message", "Hello World!");  
         // 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
         mv.setViewName("/welcome"); 
        // 返回ModelAndView对象。
        return mv;
     }


}

