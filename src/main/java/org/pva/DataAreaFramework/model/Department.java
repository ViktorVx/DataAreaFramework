package org.pva.DataAreaFramework.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column
    String name;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    Department parent;
}
