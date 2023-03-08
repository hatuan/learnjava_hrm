package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "employees", indexes = { @Index(columnList = "first_name,last_name", name = "IDX_EMP_NAME") })
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "first_name", length = 255)
    private String firstName;

    @Column(name = "last_name", length = 255)
    private String lastName;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "phone_number", length = 255)
    private String phoneNumber;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "job_id")
    private Jobs job;

    @Column(name = "salary")
    private double salary;

    @Column(name = "commission_pct")
    private double commissionPct;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Departments department;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_project",
            joinColumns = { @JoinColumn(name = "employee_id", referencedColumnName = "employee_id") },
            inverseJoinColumns = {@JoinColumn(name = "project_id", referencedColumnName = "project_id")})
    private Set<Projects> projects;

    public Employees() {

    }

    public Employees(String lastName, String firstName, String email, String phoneNumber, LocalDate hireDate, double salary, double commissionPct){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.salary = salary;
        this.commissionPct = commissionPct;
    }

    public Jobs getJob() {
        return job;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartments(Departments department) {
        this.department = department;
    }

    public Set<Projects> getProjects() {
        return projects;
    }

    public void setProjects(Set<Projects> projects) {
        this.projects = projects;
    }
}
