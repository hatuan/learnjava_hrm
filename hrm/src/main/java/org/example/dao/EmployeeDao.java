package org.example.dao;

import org.example.entities.Employees;

public interface EmployeeDao {
    public boolean save(Employees employee) throws Exception;
}
