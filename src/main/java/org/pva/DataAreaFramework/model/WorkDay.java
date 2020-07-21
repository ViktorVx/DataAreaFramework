package org.pva.DataAreaFramework.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "work_day")
public class WorkDay {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    Person person;
    @Column
    Date date;
    @Column
    WorkDayType workDayType;
}
