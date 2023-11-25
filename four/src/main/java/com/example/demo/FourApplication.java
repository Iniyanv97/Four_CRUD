package com.example.demo;

import org.springframework.boot.SpringApplication;
import java.util.List;
import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Optional;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class FourApplication {

	public static void main(String[] args) {
		final Long idd= (long) 14 ;

		ConfigurableApplicationContext context = SpringApplication.run(FourApplication.class, args);
		System.out.println("Hello word");
	Person person = new Person (idd,"A", 30);
	 PersonService personService = context.getBean(PersonService.class);
	 Person savedPerson = personService.savePerson(person);
	
	 List<Person> allPersons = personService.getAllPersons();
     System.out.println("All Persons: " + allPersons);
     Long personId = person.getId();
       System.out.println("personid" + personId);
       Person existingPerson = personService.getPersonById(personId).get();
       existingPerson.setAge(35); 
       Person updatedPerson = personService.savePerson(existingPerson);
  	 List<Person> aallPersons = personService.getAllPersons();
     System.out.println("All Persons: " + aallPersons);
     personService.deletePerson(savedPerson.getId());
     System.out.println("Person with ID " + savedPerson.getId() + " deleted.");
	}

}
