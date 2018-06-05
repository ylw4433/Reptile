package com.reptile.code.server.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reptile.code.dao.entity.User;
import com.reptile.code.dao.entity.UserExample;
import com.reptile.code.dao.mapper.UserMapper;

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
	private UserMapper	usermapper;

	public User login(User user) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(user.getUsername());
		User result = null;
		List<User> LoginUser = usermapper.selectByExample(example);
		if (LoginUser.size() > 1) {
			System.out.println("数据库异常！");
		}else if(user.getPassword().equals(LoginUser.get(0).getPassword())){			
			System.out.println("用戶名验证成功");
			result = user;
		}
		return result;
	}

	public boolean logout(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	


}

