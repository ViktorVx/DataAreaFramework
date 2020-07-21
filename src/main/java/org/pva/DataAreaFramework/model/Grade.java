package org.pva.DataAreaFramework.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "grade")
public class Grade {
    @Id
    @GeneratedValue
    Long id;
    @Column @NotNull
    String name;
    @Column
    BigDecimal downSalaryLevel;
    @Column
    BigDecimal upSalaryLevel;
}
