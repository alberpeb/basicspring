package com.perezbonin.basicspring.dao;

import java.util.List;

import com.perezbonin.basicspring.model.User;

public interface UserDao {
	
	public List<User> getAllUsers();
	
}
