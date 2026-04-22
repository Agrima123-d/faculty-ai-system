package com.example.faculty_ai_system.repository;

import com.example.faculty_ai_system.entity.TeacherSubjectMapping;
import com.example.faculty_ai_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TeacherSubjectMappingRepository extends JpaRepository<TeacherSubjectMapping, Long> {
    List<TeacherSubjectMapping> findByTeacher(User teacher);
}