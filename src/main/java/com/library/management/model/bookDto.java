package com.library.management.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class bookDto {
    private  String title;
    private String author;
    private String isbn;
    private int availableCopies;
    private int totalCopies;
}
