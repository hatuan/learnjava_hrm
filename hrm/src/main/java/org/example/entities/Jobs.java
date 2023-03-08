package org.example.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "jobs",
    indexes = {@Index(columnList = "job_id, job_title", name = "IDX_ID_TITLE")}
)
public class Jobs {
    @Id
    @Column(name = "job_id", length=10)
    private String jobId;

    @Column(name = "job_title", length = 255, nullable = false, unique = true)
    private String jobTitle;
    
    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "max_salary")
    private double maxSalary;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private JobDetails jobDetail;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "job")
    private Set<Employees> employees;
    
    public Jobs() {
    }

    public Jobs(String jobId, String jobTitle, double minSalary, double maxSalary) {
        super();

        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;

    }

    public JobDetails getJobDetail() {
        return jobDetail;
    }

    public void setJobDetails(JobDetails jobDetail){
        this.jobDetail = jobDetail;
    }
}
