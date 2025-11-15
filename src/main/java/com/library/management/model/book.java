package com.library.management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class book {

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




}
