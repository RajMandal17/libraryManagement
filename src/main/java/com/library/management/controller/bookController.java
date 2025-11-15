package com.library.management.controller;

import com.library.management.model.Book;
import com.library.management.model.BookDto;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class bookController {


    public Book saveBook(@RequestBody BookDto book) {

      Book saveBook =  Book.builder().author(book.getAuthor())
                .title(book.getTitle())
                .totalCopies(book.getTotalCopies())
                .build();
      if(book.getAvailableCopies() == 0  ){
          saveBook.setAvailableCopies(book.getTotalCopies());
      }

        return saveBook;
    }



}
