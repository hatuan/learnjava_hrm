package org.example.entities;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "candidate")
public class Candidate {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "candidate_id")
    private int candidateId;


    @Column(name = "full_name", length = 255)
    private String fullName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    private int gender;

    @Column(name = "graduation_year")
    private LocalDate graduationYear;

    @Column(name = "phone", length = 255, unique = true)
    private String phone;

    @Column(name = "email", length = 255, unique = true)
    private String email;

    @Column(name = "skill", length = 255)
    private String skill;

    @Column(name = "foreign_language", length = 255)
    private String foreignLanguage;

    @Column(name = "level")
    private int level;

    @Column(name = "cv", length = 255)
    private String cv;

    @Column(name = "allocation_Status")
    private int allocationStatus;

    public Candidate() {
    }
}