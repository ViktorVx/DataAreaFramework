package org.pva.DataAreaFramework.model;

import lombok.Data;

import java.util.Date;

@Data
public class Person {
    String firstName;
    String lastName;
    String middleName;
    Date birthDate;
    Gender gender;
}
