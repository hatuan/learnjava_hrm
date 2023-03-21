package org.example.StudentManagement.services;

import java.util.List;

import org.example.StudentManagement.entities.Student;

public interface StudentService {
    public List<Student> getStudents();

    public void saveStudent(Student theStudent);

    public Student getStudent(String theId);

    public void deleteStudent(String theId);
}
