package com.blog.services;

import java.util.List;

import com.blog.payloads.CategoryDto;
import com.blog.payloads.UserDto;

public interface CategoryService {
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	//update
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryID);
	//delete
	void deleteCategory(Integer categoryID);
	//get
	CategoryDto getCategory(Integer categoryID);
	//get all
	List<CategoryDto> getCategories();

}
