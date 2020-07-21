package org.pva.DataAreaFramework.controller;

import org.pva.DataAreaFramework.model.Person;
import org.pva.DataAreaFramework.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/person")
public class PersonController {

    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/list")
    public List<Person> getPersonsList() {
        return personRepository.findAll();
    }

}
