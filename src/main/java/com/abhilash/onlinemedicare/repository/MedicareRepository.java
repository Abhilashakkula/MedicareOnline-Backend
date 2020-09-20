package com.abhilash.onlinemedicare.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.abhilash.onlinemedicare.entity.Medicare;

public interface MedicareRepository extends JpaRepository<Medicare, Long>{
	
	/*
	 * list of books by category
	 * */
	@RestResource(path = "categoryid")
	Page<Medicare> findByCategoryId(@Param("id") Long id, Pageable pageable);
	
	/*
	 * list of books by name contains
	 * */
	@RestResource(path = "searchbykeyword")
	Page<Medicare> findByNameContaining(@Param("name") String keyword, Pageable pageable);
}
