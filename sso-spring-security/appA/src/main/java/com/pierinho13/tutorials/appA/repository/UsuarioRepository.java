package com.pierinho13.tutorials.appA.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pierinho13.tutorials.appA.model.Usuario;

public interface UsuarioRepository extends PagingAndSortingRepository< Usuario , Long > {

	Usuario findByUsername(String username);
}
