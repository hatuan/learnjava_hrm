package org.example.StudentManagement.dao.impl;

import java.util.List;

import org.example.StudentManagement.dao.StudentDAO;
import org.example.StudentManagement.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManagerFactory;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // Dependency inject the session factory

    @Autowired
	private EntityManagerFactory entityManagerFactory;

    @Override
    public List<Student> getStudents() {

        // get the current hibernate session
        Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();

        // create a query select * form Student
        Query<Student> theQuery = currentSession.createQuery("from Student", Student.class);

        // execute query and get result list
        List<Student> Students = theQuery.getResultList();

        // return the results
        return Students;

    }

    @Override
    public void saveStudent(Student theStudent) {

        // get current hibernate session
        Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();

        // save/upate the Students
        currentSession.saveOrUpdate(theStudent);

    }

    @Override
    public Student getStudent(String theId) {

        // get current hibernate session
        Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();

        // now retrieve/read from database using the primary key
        Student tempStudent = currentSession.get(Student.class, theId);

        // return the student
        return tempStudent;

    }

    @Override
    public void deleteStudent(String theId) {

        // get the current hibernate session
        Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();

        // delete student with primary key
        Query theQuery = currentSession.createQuery("delete from Student where id=:studentId");

        theQuery.setParameter("studentId", theId);

        // execute query
        theQuery.executeUpdate();

    }

}
