package org.pva.DataAreaFramework.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "organization")
public class Organization {
    @Id @GeneratedValue
    Long id;
    @Column @NotNull
    String name;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Department> departments;
}
