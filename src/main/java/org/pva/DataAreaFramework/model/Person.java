package org.pva.DataAreaFramework.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    String middleName;
    @Column
    Date birthDate;
    @Column
    Gender gender;
}
