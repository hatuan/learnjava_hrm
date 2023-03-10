package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id")
    private int projectId;

    @Column(name = "project_name", length = 255)
    private String projectName;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "project_description")
    private String projectDescription;

    @Column(name = "completed_on")
    private LocalDate completedOn;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "projects")
    private Set<Employees> employees;

    public Projects() {}

    public Projects(String projectName, LocalDate startDate, String projectDescription, LocalDate completedOn) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.projectDescription = projectDescription;
        this.completedOn = completedOn;

    }

    public Set<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employees> employees) {
        this.employees = employees;
    }
}
