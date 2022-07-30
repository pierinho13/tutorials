package com.pierinho13.tutorials.appA.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;

public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired 
	private MyUserDetailsService myUserDetailsService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName(); //sera el username 
		String credentials = (String)authentication.getCredentials();
		
		User user =   (User) this.myUserDetailsService.loadUserByUsername(username);
		
		if(user != null) {
			
			if(credentials.equals(user.getPassword())) {
				return new UsernamePasswordAuthenticationToken(user, credentials, user.getAuthorities());
			} else {
				throw new BadCredentialsException("password is incorrect");
			}
			
		} else {
			throw new BadCredentialsException("User is null");
		}
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(
		          UsernamePasswordAuthenticationToken.class);
	}

}
