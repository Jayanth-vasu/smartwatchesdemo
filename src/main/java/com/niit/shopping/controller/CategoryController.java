package com.niit.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.model.Category;
import com.niit.shopping.model.ProductDetails;
import com.niit.shopping.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@Autowired 
	Category category;

	@ModelAttribute("category")
	public Category getcategory() {
		return new Category();
	}

	@RequestMapping("/category")

	public String listCategory(Model model) {

		model.addAttribute("listCategory", categoryService.listCategory());
		return "category";
	}

	@RequestMapping(value = "/category/add", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category) {

		
		if (category.getCategory_id() == 0) {

			categoryService.addCategory(category);
		} else {

			categoryService.updateCategory(category);
		}

		return "redirect:/category";
	}

	@RequestMapping("/remove/category/{category_id}")
	public String removeCategory(@PathVariable("category_id") int category_id) {

		categoryService.removeCategory(category_id);
		return "redirect:/category";
	}

	@RequestMapping("/edit/category/{category_id}")
	public ModelAndView editProduct(@PathVariable("category_id") int category_id) {
		Category category=categoryService.getCategoryById(category_id);
		return new ModelAndView("editCategory","category",category);
		
		
	}
	@RequestMapping("/viewallcategory")
	public String viewall(Model model) {
		model.addAttribute("listCategory", categoryService.listCategory());
		return "categoryList";
	}
	
	@RequestMapping("/updatecategory")
	public String update(@ModelAttribute("category") Category category,Model model) {
		categoryService.updateCategory(category);
		
		model.addAttribute("listProducts",categoryService.listCategory());
		return "categoryList";
	}
}
