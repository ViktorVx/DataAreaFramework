package org.pva.DataAreaFramework.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.pva.DataAreaFramework.model.Person;
import org.pva.DataAreaFramework.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PersonControllerTest {

    @Autowired
    private PersonController personController;
    @Autowired
    private PersonRepository personRepository;

    @BeforeEach
    public void before() {
        personRepository.deleteAll();
    }

    @Test
    public void getPersonsListTest() {
        Person person = new Person();
        person.setFirstName("Ivan");
        personRepository.save(person);

        assertEquals(Collections.singletonList(person), personController.getPersonsList());
    }
}