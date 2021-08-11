package com.spring.orm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.orm.api.dao.PersonDao;
import com.spring.orm.api.model.Person;

@RestController
@RequestMapping("/spring-boot-orm")
public class PersonController {
	
	@Autowired
	private PersonDao dao;
	
	
	@PostMapping("/savePerson")
	public String save(@RequestBody Person person) {
		dao.savePerson(person);
		return "success";	
	}
	@GetMapping("/getALL")
	public List<Person> getALLPersons(){
		return dao.getPersons();
	}

}