package com.library.management.serviceImpe;

import com.library.management.model.Book;

import java.util.List;

public interface bookServiceImple {


    public Book findBookById(int bookId);
    public List<Book> findAllBooks();
    public Book findBookByISBN(String isbn);

}
