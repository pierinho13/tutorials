package com.pierinho13.tutorials.appA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pierinho13.tutorials.appA.model.Usuario;
import com.pierinho13.tutorials.appA.repository.UsuarioRepository;

@Controller
public class IndexController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@ResponseBody
	@RequestMapping(value = "")
	public String getIndex() {
		return "Index success";
	}
	
	@ResponseBody
	@RequestMapping(value = "/secured-url")
	public String getSecuredUrl() {
		return "Index success";
	}
	
	@ResponseBody
	@RequestMapping(value = "/free-url")
	public String getFreeUrl() {
		return "Free url success";
	}
	
	@ResponseBody
	@RequestMapping(value = "/usuario")
	public Usuario getUsuario() {
		
		Usuario usuario = this.usuarioRepository.findByUsername("pierinho13");
		return usuario;
	}
	
}
