package com.saraya.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {
	
	@Autowired
	UserValidation uservalidation;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginApp() {
		return "login";
		}
	
	@RequestMapping(value="/processForm",method=RequestMethod.POST)
	public String home(@RequestParam String username,
			@RequestParam String password, ModelMap model) {
		
		model.put("username", username);
		model.put("password", password);
		
		if(uservalidation.isValid(username, password)) {
			return "home";	
		} else {
			model.addAttribute("errorMessage", "Sorry Wrong Credential");
			return "login";
		}
	}
	
}
