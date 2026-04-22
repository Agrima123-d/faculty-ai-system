package com.example.faculty_ai_system.repository;

import com.example.faculty_ai_system.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
