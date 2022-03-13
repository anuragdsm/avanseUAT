package com.avanse.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.avanse.springboot.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

	List<Course> findAllByUniversity_Id(long id);
	
	Optional< List<Course>> findByTitleLikeOrDescriptionLikeOrExamsEligibilityLikeOrStaticContentLikeOrDocumentsRequiredLikeOrAcademicDocumentsRequiredLike(String s1, String s2, String s3, String s4, String s5, String s6);
}
