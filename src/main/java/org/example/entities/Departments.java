package org.example.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "departments")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "department_name", length = 255)
    private String departmentName;

    @Column(name = "manager_id")
    private int managerId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private Set<Employees> employees;
}
