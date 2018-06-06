package com.reptile.code.server.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reptile.code.dao.UserInfoMapper;
import com.reptile.code.entity.UserInfo;

/***********************************************
*
*@Description:登录登出service
*@author:  yaolewei
*@date：2018年5月14日
*
***********************************************/
@Service
public class LoginServerImpl implements LoginServer{
	

	@Autowired
	private UserInfoMapper	usermapper;

	public UserInfo login(UserInfo user) {

		UserInfo result = null;
		UserInfo LoginUser = usermapper.selectByuser(user.getUsername(),user.getPassword());
	    if( LoginUser != null){			
			System.out.println("用戶名验证成功");
			result = user;
		}
		return result;
	}

	public boolean logout(UserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

	


}

