package com.library.management.controller;

import com.library.management.model.book;
import com.library.management.model.bookDto;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@Mapping("/api/book")
public class bookController {


    public book saveBook(@RequestBody bookDto book) {

        book saveBook = 
        return book;
    }



}
