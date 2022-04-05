package com.avanse.springboot.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.avanse.springboot.model.Page;

public interface PageRepository extends JpaRepository<Page, Long> {
	
//	Optional<Page> findPageBytitle(String title);
	Page findPageByFileName(String fileName);
	
	@Query(value = "Select P.id,P.customUri FROM Page P")
	List<String[]> getAllUrisForPages();

	Optional<List<Page>> findByConsolidatedHTMLCodeLike(String string);
	Optional<List<Page>> findByPageTitleLikeOrMetaDescriptionLikeOrMetaKeywordLikeOrMainSectionLike(String string, String string2, String string3, String string4);
	
}
