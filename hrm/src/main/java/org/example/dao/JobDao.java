package org.example.dao;

import org.example.entities.Jobs;

public interface JobDao {
    public boolean save(Jobs job) throws Exception;
}
