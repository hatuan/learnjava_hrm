package org.example.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.time.LocalDate;

@Entity
@Table(name = "job_details")
public class JobDetails {
    @Id
    @GeneratedValue(generator = "jobgen")
    @GenericGenerator(name = "jobgen", strategy = "foreign", parameters = {
            @Parameter(name = "property", value = "job") })
    @Column(name = "job_id")
    private String jobDetailId;

    @Column(name="job_description", length = 255)
    private String jobDescription;

    @Column(name="active_date")
    private LocalDate activeDate;

    @OneToOne(mappedBy = "jobDetail")
    private Jobs job;

    public JobDetails() {

    }

    public JobDetails(String jobDescription, LocalDate activeDate) {
        this.jobDescription = jobDescription;
        this.activeDate = activeDate;
    }

    public Jobs getJob() {
        return job;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }
}
