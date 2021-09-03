package com.saraya.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {
	
	@Autowired
	TodoService todo;
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String handleDeletion(@RequestParam int delId) {
		todo.delete(delId);
		return "redirect:list";
	}

}
