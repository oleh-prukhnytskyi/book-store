package com.olegpruh.bookstore.service;

import com.olegpruh.bookstore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
