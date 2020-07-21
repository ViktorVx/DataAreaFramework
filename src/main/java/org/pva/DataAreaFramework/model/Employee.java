package org.pva.DataAreaFramework.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Employee {
    Long id;
    Person person;
    Department department;
    Grade grade;
    BigDecimal salary;
    Date beginDate;
    Date endDate;
    List<WorkDay> workDays;
}
