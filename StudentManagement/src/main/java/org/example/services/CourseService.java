package org.example.services;

import java.util.List;

import org.example.entities.Course;

public interface CourseService {
    public List<Course> getCourses();

    public void saveCourse(Course theCourse);

    public Course getCourse(String theId);

    public void deleteCourse(String theId);
}
