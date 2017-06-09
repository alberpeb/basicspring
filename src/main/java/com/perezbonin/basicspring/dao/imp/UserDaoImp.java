package com.perezbonin.basicspring.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.perezbonin.basicspring.dao.UserDao;
import com.perezbonin.basicspring.model.User;

@Repository
public class UserDaoImp implements UserDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;        

	@Override
	public List<User> getAllUsers() {
		List<User> users = jdbcTemplate.query(
                "select * from exampledb.user",
                (rs, rowNum) -> new User(rs.getInt("id"),
                        rs.getString("name"), rs.getString("surname"), rs.getString("email"), rs.getString("password"))
        );

        return users;
	}

}
