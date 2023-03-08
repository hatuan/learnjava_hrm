package org.example.services.impl;

import java.util.List;

import org.example.dao.CourseDAO;
import org.example.entities.Course;
import org.example.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class CourseServiceImpl implements CourseService {

    // Dependency inject the CourseDAO

    @Autowired
    private CourseDAO courseDAO;

    @Override
    @Transactional
    public List<Course> getCourses() {
        return courseDAO.getCourses();
    }

    @Override
    @Transactional
    public void saveCourse(Course theCourse) {
        courseDAO.saveCourse(theCourse);
    }

    @Override
    @Transactional
    public Course getCourse(String theId) {
        return courseDAO.getCourse(theId);
    }

    @Override
    @Transactional
    public void deleteCourse(String theId) {
        courseDAO.deleteCourse(theId);
    }
}
