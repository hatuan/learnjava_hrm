package org.example.dao;

import org.example.entities.Employees;
import org.example.entities.Jobs;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeDaoTest {
    static EmployeeDao employeeDao;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        employeeDao = new EmployeeDaoImpl();
    }

    @Test
    void testSave() throws Exception {
        Employees employee = new Employees("Nguyen", "Quang Anh",
                "anhnd22@fsoft.com.vn", "0988777666", LocalDate.of(2019, 1, 1), 1000, 1.1);
        Jobs job = new Jobs("J01", "Java Dev1", 1000, 2000);

        employee.setJob(job);

        assertTrue(employeeDao.save(employee));

    }

}
