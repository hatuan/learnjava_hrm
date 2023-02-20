package org.example.dao;

import org.example.entities.JobDetails;
import org.example.entities.Jobs;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobDaoTest {
    static JobDao jobDao;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        jobDao = new JobDaoImpl();
    }

    @Test
    void testSave1() throws Exception {
        JobDetails jobDetail = new JobDetails("Java Developer Level 1", LocalDate.of(2022,9,1));
        Jobs job = new Jobs("J01", "Java Dev1", 1000, 2000);

        job.setJobDetails(jobDetail);
        jobDetail.setJob(job);

        assertEquals(true, jobDao.save(job));
    }
    @Test
    void testSave2() throws Exception {
        Jobs job = new Jobs("J02", "Java Dev2", 1200, 2200);
        assertEquals(true, jobDao.save(job));
    }

}
