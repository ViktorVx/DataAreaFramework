package org.pva.DataAreaFramework.model;

import lombok.Data;

@Data
public class Department {
    Long id;
    String name;
    Department parent;
}
