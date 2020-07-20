package org.pva.DataAreaFramework.model;

import lombok.Data;

import java.util.List;

@Data
public class Organization {
    Long id;
    String name;
    List<Department> departments;
}
