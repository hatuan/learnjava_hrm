package org.example.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "entry_test")
public class EntryTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "test_id")
    private int testId;

    @Column(name = "time", length = 255)
    private String time;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "language_valuator", length = 255)
    private String languageValuator; 

    @Column(name = "language_result", precision = 4, scale = 2)
    private BigDecimal languageResult; 

    @Column(name = "technical_valuator", length = 255)
    private String technicalValuator;

    @Column(name = "technical_result", precision = 4, scale = 2)
    private BigDecimal technicalResult; 

    @Column(name = "result", length = 255)
    private String result;

    @Column(name = "remark", length = 1000)
    private String remark;

    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "candidate_id")
    private Candidate candidate;

    @Column(name = "entry_tesk_skill", length = 255)
    private String entryTestSkill;

    public EntryTest() {
    }

    
}
