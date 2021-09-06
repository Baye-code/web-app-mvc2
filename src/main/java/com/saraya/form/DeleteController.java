package com.saraya.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.service.TodoService;

@Controller
public class DeleteController {
	
	@Autowired
	TodoService todo;
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String handleDeletion(@RequestParam int delId, ModelMap model) {
		todo.delete(delId);
		model.clear();
		return "redirect:list";
	}

}
