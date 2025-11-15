package com.library.management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Table
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private  String title;
    @NotBlank
    private String author;
    @Column(unique = true, nullable = false)
    private String isbn;
    @Min(0)
    private int availableCopies;
    @Min(1)
    private int totalCopies;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @PrePersist
    public void prePersist() {
        createdDate = LocalDateTime.now();
        modifiedDate = LocalDateTime.now();
        isbn = UUID.randomUUID().toString();
    }

    @PreUpdate
    public void preUpdate() {
        modifiedDate = LocalDateTime.now();
    }




}
