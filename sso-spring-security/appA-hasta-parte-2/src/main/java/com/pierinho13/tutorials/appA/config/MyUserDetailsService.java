package com.pierinho13.tutorials.appA.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.pierinho13.tutorials.appA.model.Usuario;
import com.pierinho13.tutorials.appA.repository.UsuarioRepository;

public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = this.usuarioRepository.findByUsername(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("User doesn't exists");
		}
		
		User user = new User(username, usuario.getPassword(), true, true, true, true, usuario.getRoles());
		
		return user;
	}

}
