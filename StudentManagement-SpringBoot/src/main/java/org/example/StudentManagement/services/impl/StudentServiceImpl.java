package org.example.StudentManagement.services.impl;

import java.util.List;

import org.example.StudentManagement.dao.StudentDAO;
import org.example.StudentManagement.entities.Student;
import org.example.StudentManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getStudents() {
        return studentDAO.getStudents();
    }

    @Override
    @Transactional
    public void saveStudent(Student theStudent) {
        studentDAO.saveStudent(theStudent);
    }

    @Override
    @Transactional
    public Student getStudent(String theId) {
        return studentDAO.getStudent(theId);
    }

    @Override
    @Transactional
    public void deleteStudent(String theId) {
        studentDAO.deleteStudent(theId);
    }

}
