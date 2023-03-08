package org.example.services.impl;

import java.util.List;

import org.example.dao.StudentDAO;
import org.example.entities.Student;
import org.example.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
