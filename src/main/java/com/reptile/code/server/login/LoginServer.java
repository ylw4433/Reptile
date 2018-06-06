package com.reptile.code.server.login;

import java.util.List;

import com.reptile.code.entity.UserInfo;


/***********************************************
*
*@Description:登录登出
*@author:  <br/>
*@date：2018年5月14日
*
***********************************************/
public interface LoginServer {
	
	//登录
	UserInfo login(UserInfo user);
	//登出
	boolean logout(UserInfo user);
}

