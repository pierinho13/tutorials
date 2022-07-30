package com.pierinho13.tutorials.appA.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.JoinColumn;

@Entity
public class Usuario {

	private Long id;
	private String username;
	private String password;
	private Set<Rol> roles = new HashSet<Rol>();
	
	@Id
	@SequenceGenerator(name="Usuario_pk_sequence",sequenceName="Usuario_sequence",allocationSize=1) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Usuario_pk_sequence")
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="usuario_role", joinColumns=@JoinColumn(name="usuario_id"), inverseJoinColumns=@JoinColumn(name="roles_id"))
	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}
	
	
	
}
