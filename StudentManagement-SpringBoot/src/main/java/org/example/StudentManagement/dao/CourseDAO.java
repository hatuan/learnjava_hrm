package org.example.StudentManagement.dao;

import java.util.List;

import org.example.StudentManagement.entities.Course;

public interface CourseDAO {
    public List<Course> getCourses();

    public void saveCourse(Course theCourse);

    public Course getCourse(String theId);

    public void deleteCourse(String theId);

}
