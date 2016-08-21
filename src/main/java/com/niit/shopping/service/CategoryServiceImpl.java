package com.niit.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopping.dao.CategoryDAO;
import com.niit.shopping.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired CategoryDAO categoryDAO;
	
	@Transactional
	public void addCategory(Category category) {
		categoryDAO.addCategory(category);

	}

	@Transactional
	public void updateCategory(Category category) {
		categoryDAO.updateCategory(category);

	}

	@Transactional
	public List<Category> listCategory() {
		return categoryDAO.listCategory();
	}

	@Transactional
	public Category getCategoryById(int category_id) {
		return categoryDAO.getCategoryById(category_id);
	}

	@Transactional
	public void removeCategory(int category_id) {
		categoryDAO.removeCategory(category_id);

	}

}
