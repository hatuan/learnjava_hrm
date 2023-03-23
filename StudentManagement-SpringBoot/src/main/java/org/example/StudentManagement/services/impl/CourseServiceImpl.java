package org.example.StudentManagement.services.impl;

import java.util.List;

import org.example.StudentManagement.repositories.CourseRepository;
import org.example.StudentManagement.entities.Course;
import org.example.StudentManagement.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public List<Course> getCourses() {
        return  courseRepository.findAll();
    }

    @Override
    @Transactional
    public void saveCourse(Course theCourse) {
        courseRepository.save(theCourse);
    }

    @Override
    @Transactional
    public Course getCourse(String theId) throws RuntimeException {
        return courseRepository.findById(theId).orElseThrow(()->new RuntimeException(theId));
    }

    @Override
    @Transactional
    public void deleteCourse(String theId) {
        courseRepository.deleteById(theId);
    }
}
