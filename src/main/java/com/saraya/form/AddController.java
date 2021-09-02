package com.saraya.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {
	
	@Autowired
	TodoService todo;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String displayAdd() {
		return "add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String handleForm(@RequestParam("addUser") String addUser, 
							 @RequestParam("addDesc") String addDesc,
							 @RequestParam("addIsDone") boolean addIsDone,
							 Model model) {
		todo.add(addUser, addDesc, addIsDone);
		return "redirect:list";
	}

}
