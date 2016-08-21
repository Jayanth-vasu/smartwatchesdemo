package com.niit.shopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.model.ProductDetails;
import com.niit.shopping.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		session.setAttribute("listBrands", productService.listBrands());
		return "index";
	}

	
	/*
	 * @RequestMapping(value = "/login") public String getlogin() { return
	 * "login"; }
	 */

	/*
	 * @RequestMapping(value = "/submit") public String submit() { return
	 * "index"; }/*
	 * 
	 * /*@RequestMapping(value = "/signup") public String signup() { return
	 * "index"; }
	 */
	@RequestMapping("/index")
	public String home() {
		return "index";
	}
	

	@RequestMapping(value ="/brand/{product_brand}")
	public ModelAndView brand(@PathVariable("product_brand") String product_brand,HttpSession session,Model model) {
		session.setAttribute("brand",productService.getProductByBrand(product_brand));
		return new ModelAndView("brand");
		
	}
	
	@RequestMapping("/view/{product_id}")
	public ModelAndView editProduct(@PathVariable("product_id") int product_id,HttpSession session) {
		session.setAttribute("viewproduct",productService.getViewProductById(product_id));
		return new ModelAndView("viewproduct");
	}
	
	@RequestMapping(value = "/motobrand")
	public String motobrand() {
		return "motobrand";
	}

	@RequestMapping(value = "/sportwatch")
	public String sportwatch() {
		return "sportwatch";
	}

	@RequestMapping(value = "/huaweibrand")
	public String huaweibrand() {
		return "huaweibrand";
	}

	@RequestMapping(value = "/asusbrand")
	public String asusbrand() {
		return "asusbrand";
	}

	@RequestMapping(value = "/samsungbrand")
	public String samsungbrand() {
		return "samsungbrand";
	}

	@RequestMapping(value = "/intex")
	public String intex() {
		return "intex";
	}

	@RequestMapping(value = "/samsung")
	public String samsung() {
		return "samsung";
	}

	@RequestMapping(value = "/alcatel")
	public String alcatel() {
		return "alcatel";
	}

	@RequestMapping(value = "/apple")
	public String apple() {
		return "apple";
	}

	@RequestMapping(value = "/asus")
	public String asus() {
		return "asus";
	}

	@RequestMapping(value = "/sony")
	public String sony() {
		return "sony";
	}
	
	@RequestMapping(value = "/manage")
	public String manage() {
		return "manage";
	}
	
	@RequestMapping(value = "/loginerror")
	public String loginerror() {
		return "loginerror";
	}
	
	@RequestMapping(value = "/403")
	public String loginerror403() {
		return "loginerror";
	}
}
