package com.pierinho13.tutorials.appA.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface RolRepository extends PagingAndSortingRepository< RolRepository , Long > {

	Iterable<RolRepository> findAll();
}
