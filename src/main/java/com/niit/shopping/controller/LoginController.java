package com.niit.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.model.UserDetails;
import com.niit.shopping.service.LoginService;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String loginshow() {

		return "login";
	}


	

	@ModelAttribute("userDetails")
	public UserDetails getob() {
		return new UserDetails();
	}
}
	/*@Autowired(required = true)
	LoginService ls;
	@RequestMapping(value = "/loginpage", method = RequestMethod.POST)
	public ModelAndView loginuser(@ModelAttribute UserDetails u) {
		boolean isvaliduser = false;
		
		 * u.setUser_name(name); u.setUser_password(pwd);
		 
		isvaliduser = ls.checkUser(u);
		ModelAndView mv = new ModelAndView("index");
		if (isvaliduser == true) {
			
			mv.addObject("msg", "Welcome");
			mv.addObject("name", u.getUser_firstname());
		}
		return mv;
	}

}
*/