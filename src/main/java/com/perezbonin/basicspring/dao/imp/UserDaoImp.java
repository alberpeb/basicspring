package com.perezbonin.basicspring.dao.imp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.perezbonin.basicspring.bo.User;
import com.perezbonin.basicspring.dao.UserDao;

public class UserDaoImp implements UserDao{
	
	private DataSourceTransactionManager transactionManager;
	private JdbcTemplate jdbcTemplate;
	
	UserDaoImp(){
		super();
		DataSource dataSource = transactionManager.getDataSource();
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<User> allUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
