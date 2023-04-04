package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public Person findById(String id) {
		
		logger.info("Buscando uma pessoa por id");
		
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setPrimeiroNome("Cleber");
		person.setSegundoNome("Brant");
		person.setEndereco("Brasilia");
		person.setGenero("Masculino");
		
		return person;
	}
	
	public Person create(Person person) {
		
		logger.info("Creating one person!");
		
		return person;
	}
	
	public Person update(Person person) {
		
		logger.info("Updating one person!");
		
		return person;
	}
	
	public void delete(String id) {
		
		logger.info("Deleting one person!");
		
	}
	
	public List<Person> findAll() {
		
		logger.info("Buscando uma lista de pessoas");
		
		List<Person> persons = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setPrimeiroNome("Nome: " + i);
		person.setSegundoNome("Sobrenome: " + i);
		person.setEndereco("Endereco: " + i);
		person.setGenero("Genero: " + i);
		return person;
	}

}
