package com.saraya.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import java.util.Iterator;


@Service
public class TodoService {
	
	private static ArrayList<Todo> todos= new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("babacar","Spring Mvc", new Date(), false));
		todos.add(new Todo("tidiani","Angular", new Date(), false));
		todos.add(new Todo("babacar","Spring Boot", new Date(), false));
		todos.add(new Todo("tidiani","AWS", new Date(), false));
	}

	//List<Todo> theTDL= new ArrayList<Todo>();
	
	public ArrayList<Todo> retrieveAll() {
		return todos;
	}

	// Delete Functionality
	public void delete(int id) {
		Iterator<Todo> it = todos.iterator();
		while (it.hasNext()) {
			Todo elt = it.next();
			if (elt.getId() == id) {
				todos.remove(id-1);
			}else {
				continue;
			}
		}
	}
	
	// Add funtionality
	public void add(String username, String desc, boolean isDone) {
		todos.add(new Todo(username,desc, new Date(), isDone));
	}

}
