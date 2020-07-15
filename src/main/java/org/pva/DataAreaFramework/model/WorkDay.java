package org.pva.DataAreaFramework.model;

import lombok.Data;

import java.util.Date;

@Data
public class WorkDay {
    Person person;
    Date date;
    WorkDayType workDayType;
}
