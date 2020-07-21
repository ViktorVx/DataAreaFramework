package org.pva.DataAreaFramework.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column @NotNull
    String firstName;
    @Column @NotNull
    String lastName;
    @Column
    String middleName;
    @Column
    Date birthDate;
    @Column
    Gender gender;
}
