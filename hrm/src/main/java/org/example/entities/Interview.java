package org.example.entities;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "interview_id")
    private int interviewId;

    @Column(name="date")
    private LocalDate date;

    @Column(name="interviewer", length = 255)
    private String interviewer;

    @Column(name = "comments", length = 2000)
    private String comments;

    @Column(name = "interview_result", length = 255)
    private String interviewResult;

    @Column(name = "remark", length = 255)
    private String remark;

    public Interview() {
    }
   
    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "candidate_id")
    private Candidate candidate;

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Candidate getCandidate() {
        return candidate;
    }


}
