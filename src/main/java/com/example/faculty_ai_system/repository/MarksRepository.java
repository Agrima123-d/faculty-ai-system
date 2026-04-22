package com.example.faculty_ai_system.repository;

import com.example.faculty_ai_system.entity.Marks;
import com.example.faculty_ai_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MarksRepository extends JpaRepository<Marks, Long> {
    List<Marks> findByStudent(Student student);
}