package org.example.dao;

import org.example.entities.Candidate;

public interface CandidateDao {
    public boolean save(Candidate candidate) throws Exception;
}
