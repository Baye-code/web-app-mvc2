package com.saraya.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("username")
public class ListController {

	@Autowired
	TodoService todoservice;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String fstApp(ModelMap model) {
		
		String username = (String) model.get("username");
		model.addAttribute("todos", todoservice.retrieveAll());
		
		return "list";
	}
}
