package com.example.faculty_ai_system.repository;

import com.example.faculty_ai_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findBySection(String section);
    List<Student> findByDepartmentAndSemester(String department, Integer semester);
}