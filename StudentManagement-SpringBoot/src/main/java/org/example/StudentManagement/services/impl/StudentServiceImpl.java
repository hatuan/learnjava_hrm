package org.example.StudentManagement.services.impl;

import java.util.List;

import org.example.StudentManagement.repositories.StudentRepository;
import org.example.StudentManagement.entities.Student;
import org.example.StudentManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public void saveStudent(Student theStudent) {
        studentRepository.save(theStudent);
    }

    @Override
    @Transactional
    public Student getStudent(String theId) throws RuntimeException  {
        return studentRepository.findById(theId).orElseThrow(() -> new RuntimeException (theId));
    }

    @Override
    @Transactional
    public void deleteStudent(String theId) {
        studentRepository.deleteById(theId);
    }

}
