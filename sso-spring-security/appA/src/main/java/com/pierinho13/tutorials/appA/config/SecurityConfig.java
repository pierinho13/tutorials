package com.pierinho13.tutorials.appA.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
		.authorizeRequests().antMatchers("/free-url").permitAll()
		.anyRequest().authenticated()
		.and().formLogin();
		
		return http.build();
	}
	
}
