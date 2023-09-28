package com.olegpruh.bookstore.service;

import com.olegpruh.bookstore.dto.request.CreateBookRequestDto;
import com.olegpruh.bookstore.dto.response.BookDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto findBookById(Long id);
}
