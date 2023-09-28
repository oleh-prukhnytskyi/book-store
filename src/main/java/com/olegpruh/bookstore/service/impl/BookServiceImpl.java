package com.olegpruh.bookstore.service.impl;

import com.olegpruh.bookstore.dto.request.CreateBookRequestDto;
import com.olegpruh.bookstore.dto.response.BookDto;
import com.olegpruh.bookstore.exception.BookNotFoundException;
import com.olegpruh.bookstore.mapper.BookMapper;
import com.olegpruh.bookstore.model.Book;
import com.olegpruh.bookstore.repository.BookRepository;
import com.olegpruh.bookstore.service.BookService;
import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto save(CreateBookRequestDto requestDto) {
        Book book = bookRepository.save(bookMapper.toModel(requestDto));
        return bookMapper.toDto(book);
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookDto findBookById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
        return bookMapper.toDto(book);
    }
}
