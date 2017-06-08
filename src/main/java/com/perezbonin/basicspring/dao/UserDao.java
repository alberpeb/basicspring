package com.perezbonin.basicspring.dao;

import java.util.List;

import com.perezbonin.basicspring.bo.User;

public interface UserDao {
	public List<User> allUsers();
}
