package org.example.StudentManagement.repositories;

import org.example.StudentManagement.entities.Course;
import org.springframework.data.repository.ListCrudRepository;

public interface CourseRepository extends ListCrudRepository<Course, String> {


}
