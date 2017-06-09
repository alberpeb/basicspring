package com.perezbonin.basicspring.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.perezbonin.basicspring.dao.UserDao;
import com.perezbonin.basicspring.dao.imp.UserDaoImp;

@Configuration
@EnableAutoConfiguration 
public class UserDaoConfig {
	
	@Bean 
    public UserDao userDaoImp() {
        return new UserDaoImp();
    }
}
