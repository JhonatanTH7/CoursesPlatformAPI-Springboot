package com.Platform.Courses.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "assignments")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assignment")
    private Long idAssignment;
    @Column(name = "assignment_title", length = 100, nullable = false)
    private String assignmentTitle;
    @Lob
    @Column(nullable = false)
    private String description;
    @Column(name = "due_date", nullable = false)
    private LocalDate dueDate;

}
