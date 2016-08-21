package com.niit.shopping.service;

import java.util.List;

import com.niit.shopping.model.Category;

public interface CategoryService {
	public void addCategory(Category category);
	public void updateCategory(Category category);
	public List<Category> listCategory();
	public Category getCategoryById(int category_id);
	public void removeCategory(int category_id);
}
