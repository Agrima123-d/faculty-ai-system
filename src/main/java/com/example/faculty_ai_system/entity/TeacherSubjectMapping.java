package com.example.faculty_ai_system.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teacher_subject_mapping")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherSubjectMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "teacher_user_id")
    private User teacher;          // <-- renamed from teacherUserId to teacher

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    private String section;
    private Integer semester;
}