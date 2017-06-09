package com.perezbonin.basicspring.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.perezbonin.basicspring.dao.UserDao;
import com.perezbonin.basicspring.service.UserService;
import com.perezbonin.basicspring.service.json.UserToJson;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public String getAllUsers() {
		String userJson = null;
		try {
			userJson = UserToJson.objectListJson(userDao.getAllUsers());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userJson;
	}

}
