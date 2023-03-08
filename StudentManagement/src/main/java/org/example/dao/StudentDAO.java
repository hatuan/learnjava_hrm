package org.example.dao;

import java.util.List;

import org.example.entities.Student;

public interface StudentDAO {

    public List<Student> getStudents();

    public void saveStudent(Student theStudent);

    public Student getStudent(String theId);

    public void deleteStudent(String theId);

}
