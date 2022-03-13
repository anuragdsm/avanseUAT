package com.avanse.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.avanse.springboot.model.University;

public interface UniversityRepository extends JpaRepository<University, Long> {
	

	Optional<List<University>> findByNameLikeOrLocationLikeOrDescriptionLikeOrApplicationProcessLikeOrStaticContentLike(String s1, String s2, String s3, String s4, String s5);
	
}
