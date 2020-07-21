package org.pva.DataAreaFramework.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id @GeneratedValue
    Long id;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    Person person;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    Department department;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    Grade grade;
    @Column
    BigDecimal salary;
    @Column
    Date beginDate;
    @Column
    Date endDate;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<WorkDay> workDays;
}
