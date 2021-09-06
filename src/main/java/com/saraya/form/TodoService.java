package com.saraya.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import java.util.Iterator;


@Service
public class TodoService {
	
	private static ArrayList<Todo> todos= new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Babacar","Spring Mvc", new Date(), false));
		todos.add(new Todo("Tidiani","Angular", new Date(), false));
		todos.add(new Todo("Diémé","Spring Boot", new Date(), false));
		todos.add(new Todo("Baye","AWS Azure GCP", new Date(), false));
		todos.add(new Todo("Ndiaye","Python", new Date(), false));
		todos.add(new Todo("Tall","Django", new Date(), false));
	}
	
	// List<Todo> todosToRemove = new ArrayList<Todo>();
	
	public ArrayList<Todo> retrieveAll() {
		return todos;
	}

	// Delete Functionality
	public void delete(int id) {
		Iterator<Todo> it = todos.iterator();
		while (it.hasNext()) {
			Todo elt = it.next();
			if (elt.getId() == id) {
				//todosToRemove.add(elt);
				it.remove();
			}
		}
		//todos.removeAll(todosToRemove);
	}
	
	// Delete Functionality using FP paradigm
	public void deleteByStream(int id) {
			todos = (ArrayList<Todo>) todos.stream()
					.filter(e -> !(e.getId()==id))
					.collect(Collectors.toList());
		}
	
	// Add funtionality
	public void add(String username, String desc, boolean isDone) {
		todos.add(new Todo(username,desc, new Date(), isDone));
	}
	
	// Get the Id for update
//	public Todo findByIdwithIterator(int uId) {
//		Iterator<Todo> it = todos.iterator();
//		while (it.hasNext()) {
//			Todo elt = it.next();
//			if (elt.getId() == uId) {
//				return elt;
//			}
//		}
//		return null;
//	}
	
	public Todo findById(int uId) {
		for(Todo todo : todos) {
			if(todo.getId() == uId) {
				return todo;
			}
		}
		return null;
	}
	
	public void updateTodo(Todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}

}
