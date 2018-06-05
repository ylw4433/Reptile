package com.reptile.code.server.login;

import java.util.List;

import com.reptile.code.dao.entity.User;


/***********************************************
*
*@Description:登录登出
*@author:  <br/>
*@date：2018年5月14日
*
***********************************************/
public interface LoginServer {
	
	//登录
	User login(User user);
	//登出
	boolean logout(User user);
}

