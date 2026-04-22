package com.example.faculty_ai_system.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "query_logs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QueryLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false, length = 1000)
    private String naturalLanguageQuery;

    @Column(length = 2000)
    private String generatedJson;

    @Column(nullable = false)
    private boolean success;

    private String errorMessage;

    private LocalDateTime queriedAt;

    @PrePersist
    public void prePersist() {
        this.queriedAt = LocalDateTime.now();
    }
}