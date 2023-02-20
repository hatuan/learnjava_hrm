package org.example.dao;

import org.example.entities.Employees;
import org.example.entities.Jobs;

public interface EmployeeDao {
    public boolean save(Employees employee) throws Exception;
}
