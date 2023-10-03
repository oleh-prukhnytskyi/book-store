package com.olegpruh.bookstore.service;

import com.olegpruh.bookstore.dto.BookSearchParametersDto;
import com.olegpruh.bookstore.dto.request.CreateBookRequestDto;
import com.olegpruh.bookstore.dto.response.BookDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll(Pageable pageable);

    BookDto findBookById(Long id);

    void deleteById(Long id);

    BookDto update(Long id, CreateBookRequestDto requestDto);

    List<BookDto> search(BookSearchParametersDto params);
}
