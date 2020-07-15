package org.pva.DataAreaFramework.model;

import lombok.Data;

import java.util.List;

@Data
public class Organization {
    String name;
    List<Department> departments;
}
