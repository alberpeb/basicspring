package com.perezbonin.basicspring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perezbonin.basicspring.dao.UserDao;
import com.perezbonin.basicspring.model.User;
import com.perezbonin.basicspring.service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
