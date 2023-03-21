package org.example.StudentManagement.dao;

import java.util.List;

import org.example.StudentManagement.entities.Student;

public interface StudentDAO {

    public List<Student> getStudents();

    public void saveStudent(Student theStudent);

    public Student getStudent(String theId);

    public void deleteStudent(String theId);

}
