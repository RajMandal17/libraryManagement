package com.library.management.model;

import lombok.Data;

@Data
public class BookDto {
    private  String title;
    private String author;
    private int availableCopies;
    private int totalCopies;
}
