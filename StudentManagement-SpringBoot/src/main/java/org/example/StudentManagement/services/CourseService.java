package org.example.StudentManagement.services;

import java.util.List;

import org.example.StudentManagement.entities.Course;

public interface CourseService {
    public List<Course> getCourses();

    public void saveCourse(Course theCourse);

    public Course getCourse(String theId);

    public void deleteCourse(String theId);
}
