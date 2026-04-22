package com.example.faculty_ai_system.repository;

import com.example.faculty_ai_system.entity.QueryLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryLogRepository extends JpaRepository<QueryLog, Long> {
}