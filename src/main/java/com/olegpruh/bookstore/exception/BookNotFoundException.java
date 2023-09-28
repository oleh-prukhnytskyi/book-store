package com.olegpruh.bookstore.exception;

import javax.persistence.EntityNotFoundException;

public class BookNotFoundException extends EntityNotFoundException {
    public BookNotFoundException(Long id) {
        super("Book with id " + id + " was not found.");
    }
}
