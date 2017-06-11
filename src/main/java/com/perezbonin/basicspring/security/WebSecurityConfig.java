package com.perezbonin.basicspring.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@ConditionalOnWebApplication
//@Profile("!integTest")
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	public static final String[] PROTECTED_RESOURCES = new String[] {  "/myrestfullapp/cotizacion/real", "/myrestfullapp/cotizacion/peso" };

	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http
        .csrf().disable()
        .authorizeRequests()
          .antMatchers(PROTECTED_RESOURCES)
          .permitAll()
        .and()
          .anonymous().disable()
			.exceptionHandling()
	        .authenticationEntryPoint(new org.springframework.boot.autoconfigure.security.Http401AuthenticationEntryPoint("headerValue"));
    }

}
