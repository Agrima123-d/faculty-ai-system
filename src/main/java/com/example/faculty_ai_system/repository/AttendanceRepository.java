package com.example.faculty_ai_system.repository;

import com.example.faculty_ai_system.entity.AttendanceRecord;
import com.example.faculty_ai_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AttendanceRepository extends JpaRepository<AttendanceRecord, Long> {
    List<AttendanceRecord> findByStudent(Student student);
}