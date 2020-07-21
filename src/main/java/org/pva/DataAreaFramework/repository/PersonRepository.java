package org.pva.DataAreaFramework.repository;

import org.pva.DataAreaFramework.model.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonRepository extends Repository<Person, Long> {

    void save(Person person);

    void deleteAll();

    List<Person> findAll();
}
