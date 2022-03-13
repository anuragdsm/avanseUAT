package com.avanse.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanse.springboot.DTO.SearchResultDTO;
import com.avanse.springboot.model.Course;
import com.avanse.springboot.model.Page;
import com.avanse.springboot.model.Post;
import com.avanse.springboot.model.University;

@Service
public class SearchService {

	@Autowired
	PageService pageService;
	@Autowired
	PostService postService;

	@Autowired
	UniversityService universityService;
	
	@Autowired
	CourseService courseService;
	
	
	
	  public List<SearchResultDTO> getGlobalSearchResults(String searchKey) { 
	 
	  List<Page> pageSearchResults = pageService.getSearchResultsInPages(searchKey);
	  List<Post> postSearchResults = postService.getSearchResultsInBlogs(searchKey); 
	  List<University> universitySearchResults = universityService.getSearchResultsFromUniversities(searchKey);
	  List<Course> courseSearchResults = courseService.getSearchResultsForCourses(searchKey);
	  
	  List<SearchResultDTO> searchResultDtoList = new ArrayList<>();
	  
	  List<SearchResultDTO> collectedFromPageSearch = pageSearchResults.stream()
	  .map(pr -> { 
		  SearchResultDTO searchResultDTO = new SearchResultDTO(); 
		  searchResultDTO.setResultOrigin("page");
		  searchResultDTO.setHeading(pr.getPageTitle());
		  searchResultDTO.setUrl(pr.getCustomUri());
		  String customDescription = pr.getMainSection();
		  if(customDescription.toLowerCase().contains(searchKey.toLowerCase())) {
			  customDescription=getDescriptionSnipetWithSearchKeyHighlighted(customDescription, searchKey);
		  } else {
			 customDescription = customDescription.substring(0, (customDescription.length() >= 100)? 100 : customDescription.length());
		  }
		  searchResultDTO.setDescriptionContainingKey(customDescription);
		  return searchResultDTO;
		  }).collect(Collectors.toList());
	  
	  searchResultDtoList.addAll(collectedFromPageSearch);
	  
	  List<SearchResultDTO> collectedFromPostSearch = postSearchResults.stream()
		.map(psr -> {
		  SearchResultDTO searchResultDTO = new SearchResultDTO();
		  searchResultDTO.setResultOrigin("post");
		  searchResultDTO.setHeading(psr.getPostTitle());
		  searchResultDTO.setUrl("/blog/"+psr.getPostTitle());
		  String customDescription = psr.getMainSection();
		  if(customDescription.toLowerCase().contains(searchKey.toLowerCase())) {
			  customDescription=getDescriptionSnipetWithSearchKeyHighlighted(customDescription, searchKey);
		  } else {
			 customDescription = customDescription.substring(0, (customDescription.length() >= 200)? 200 : customDescription.length());
		  }
		  searchResultDTO.setDescriptionContainingKey(customDescription);
		  return searchResultDTO;
	  }).collect(Collectors.toList());
	  
	  searchResultDtoList.addAll(collectedFromPostSearch);
	  
	  List<SearchResultDTO> collectedFromUniversitySearch = universitySearchResults.stream()
			  .map(usr -> {
				  SearchResultDTO searchResultDTO = new SearchResultDTO();
				  searchResultDTO.setResultOrigin("university");
				  searchResultDTO.setHeading(usr.getName());
				  searchResultDTO.setUrl("/UID/"+usr.getId());
				  if(usr.getApplicationProcess().toLowerCase().contains(searchKey.toLowerCase())) {
					searchResultDTO.setDescriptionContainingKey(getDescriptionSnipetWithSearchKeyHighlighted(usr.getApplicationProcess(), searchKey));  
				  } else if(usr.getDescription().toLowerCase().contains(searchKey.toLowerCase())) {
					  searchResultDTO.setDescriptionContainingKey(getDescriptionSnipetWithSearchKeyHighlighted(usr.getDescription(), searchKey));
				  } else if(usr.getIntakePeriod().toLowerCase().contains(searchKey.toLowerCase())) {
					  searchResultDTO.setDescriptionContainingKey(getDescriptionSnipetWithSearchKeyHighlighted(usr.getIntakePeriod(), searchKey));
				  } else {
					  searchResultDTO.setDescriptionContainingKey(usr.getDescription().substring(0,(usr.getDescription().length() >= 200)? 200 : usr.getDescription().length()));
				  }
				  return searchResultDTO;
			  })
			  .collect(Collectors.toList());
	  
	  searchResultDtoList.addAll(collectedFromUniversitySearch);
	  
	  List<SearchResultDTO> collectedFromCourseSearch = courseSearchResults.stream()
			  .map(csr -> {
				  SearchResultDTO searchResultDTO = new SearchResultDTO();
				  searchResultDTO.setResultOrigin("course");
				  searchResultDTO.setHeading(csr.getTitle());
				  searchResultDTO.setUrl("/courseDetail/"+csr.getId());
				  if(csr.getAcademicDocumentsRequired().toLowerCase().contains(searchKey.toLowerCase())) {
					  searchResultDTO.setDescriptionContainingKey(getDescriptionSnipetWithSearchKeyHighlighted(csr.getAcademicDocumentsRequired(), searchKey));
				  } else if(csr.getDescription().toLowerCase().contains(searchKey.toLowerCase())) {
					  searchResultDTO.setDescriptionContainingKey(getDescriptionSnipetWithSearchKeyHighlighted(csr.getDescription(), searchKey));
				  } else if(csr.getDocumentsRequired().toLowerCase().contains(searchKey.toLowerCase())) {
					  searchResultDTO.setDescriptionContainingKey(getDescriptionSnipetWithSearchKeyHighlighted(csr.getDocumentsRequired(), searchKey));
				  } else if(csr.getExamsEligibility().toLowerCase().contains(searchKey.toLowerCase())) {
					  searchResultDTO.setDescriptionContainingKey(getDescriptionSnipetWithSearchKeyHighlighted(csr.getExamsEligibility(), searchKey));
				  } else {
					  searchResultDTO.setDescriptionContainingKey(csr.getDescription().substring(0, (csr.getDescription().length() >= 200)? 200 : csr.getDescription().length()));
				  }
				  return searchResultDTO;
			  })
			  .collect(Collectors.toList());
	  
	  searchResultDtoList.addAll(collectedFromCourseSearch);
			 
	  return searchResultDtoList;
	  }
	  
	  public static String getDescriptionSnipetWithSearchKeyHighlighted(String contentText, String searchKey) {
			
		  int beginIndex = contentText.toLowerCase().indexOf(searchKey.toLowerCase());
		  int endIndex = beginIndex + searchKey.length();
		  int beginStrip = (beginIndex >= 100)? (beginIndex - 100) : 0;
		  int endStrip = ((endIndex+100) <= contentText.length())? (endIndex+100) : (contentText.length());
		  
		  String genratedSubString = contentText.substring(beginStrip, endStrip);
		  int begin = genratedSubString.toLowerCase().indexOf(searchKey.toLowerCase());
		  int end = begin + searchKey.length();
		  String finalSubString = "..." + genratedSubString.substring(0, begin) + "<b style=\"background-color:yellow;\">" + genratedSubString.substring(begin, end) + "</b>" + genratedSubString.substring(end, genratedSubString.length()) + "...";
		  return finalSubString;
	  }
	 
}
