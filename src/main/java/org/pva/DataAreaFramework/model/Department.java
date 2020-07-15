package org.pva.DataAreaFramework.model;

import lombok.Data;

@Data
public class Department {
    String name;
    Department parent;
}
