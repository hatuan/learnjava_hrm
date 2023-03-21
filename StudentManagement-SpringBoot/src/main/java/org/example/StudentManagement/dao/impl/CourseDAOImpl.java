package org.example.StudentManagement.dao.impl;

import java.util.List;

import org.example.StudentManagement.dao.CourseDAO;
import org.example.StudentManagement.entities.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManagerFactory;

@Repository
public class CourseDAOImpl implements CourseDAO {

    // Dependency inject the session factory
    @Autowired
	private EntityManagerFactory entityManagerFactory;

    @Override
    public List<Course> getCourses() {

        // get the current hibernate session
        Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();

        // create a query select * form Student
        Query<Course> theQuery = currentSession.createQuery("from Course", Course.class);

        // execute query and get result list
        List<Course> Courses = theQuery.getResultList();

        // return the results
        return Courses;

    }

    @Override
    public void saveCourse(Course theCourse) {

        // get current hibernate session
        Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();

        // save/upate the Course
        currentSession.saveOrUpdate(theCourse);

    }

    @Override
    public Course getCourse(String theId) {

        // get current hibernate session
        Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();

        // now retrieve/read from database using the primary key
        Course tempCourse = currentSession.get(Course.class, theId);

        // return the course
        return tempCourse;

    }

    @Override
    public void deleteCourse(String theId) {

        // get current hibernate session
        Session currentSession = entityManagerFactory.unwrap(SessionFactory.class).openSession();

        // delete student with primary key
        Query theQuery = currentSession.createQuery("delete from Course where id=:courseId");

        // set parameter in query
        theQuery.setParameter("courseId", theId);

        // execute query
        theQuery.executeUpdate();

    }

}