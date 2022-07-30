package com.pierinho13.tutorials.appA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Rol implements GrantedAuthority {
	
	private Long id;
	private String name;
	 
	 
	@Id
	@SequenceGenerator(name="Role_pk_sequence",sequenceName="Role_sequence",allocationSize=1) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Role_pk_sequence")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Transient
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return name;
	}
	
	private static final long serialVersionUID = -7255545677800576509L;
	 
}
