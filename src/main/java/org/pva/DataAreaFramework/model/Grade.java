package org.pva.DataAreaFramework.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Grade {
    Long id;
    String name;
    BigDecimal downSalaryLevel;
    BigDecimal upSalaryLevel;
}
