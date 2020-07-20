package org.pva.DataAreaFramework.model;

import lombok.Data;

import java.util.Date;

@Data
public class WorkDay {
    Long id;
    Person person;
    Date date;
    WorkDayType workDayType;
}
