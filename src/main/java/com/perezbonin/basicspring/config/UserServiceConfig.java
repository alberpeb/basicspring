package com.perezbonin.basicspring.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.perezbonin.basicspring.service.UserService;
import com.perezbonin.basicspring.service.imp.UserServiceImp;

@Configuration
@EnableAutoConfiguration 
public class UserServiceConfig {
 
    @Bean 
    public UserService userServiceImp() {
        return new UserServiceImp();
    }
}