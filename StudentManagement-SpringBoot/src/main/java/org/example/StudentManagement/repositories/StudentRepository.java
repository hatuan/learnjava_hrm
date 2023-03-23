package org.example.StudentManagement.repositories;

import java.util.List;

import org.example.StudentManagement.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface StudentRepository extends ListCrudRepository<Student, String> {

}
