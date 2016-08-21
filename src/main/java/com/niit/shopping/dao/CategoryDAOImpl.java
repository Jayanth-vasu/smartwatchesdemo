package com.niit.shopping.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shopping.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO{

	@Autowired 
	SessionFactory session;
	
	@Override
	public void addCategory(Category category) {
		session.getCurrentSession().save(category);
		
	}

	@Override
	public void updateCategory(Category category) {
		 session.getCurrentSession().update(category);
		
	}

	@Override
	public List listCategory() {
		
				return session.getCurrentSession().createQuery("from Category").list();
		
	}

	@Override
	public Category getCategoryById(int category_id) {
		return (Category)session.getCurrentSession().get(Category.class, category_id);
	
	}

	@Override
	public void removeCategory(int category_id) {
		session.getCurrentSession().delete(getCategoryById(category_id));
		
	}

}
