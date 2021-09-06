package com.saraya.form;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.Todo;
import com.saraya.service.TodoService;

@Controller
public class UpdateController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(@RequestParam int uId, ModelMap model) {
		model.addAttribute("todo", todoService.findById(uId));
		return "update";
	}
	
	@RequestMapping(value="/updateProcess", method=RequestMethod.POST)
	public String updateProcess(@Valid @ModelAttribute("todo")Todo todo, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        
        todoService.delete(todo.getId());
        todoService.add(todo.getUsername(), todo.getDesc(), false);
        
        return "redirect:list";
	}

}
