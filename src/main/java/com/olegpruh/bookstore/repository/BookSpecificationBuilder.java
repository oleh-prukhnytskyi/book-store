package com.olegpruh.bookstore.repository;

import com.olegpruh.bookstore.dto.BookSearchParametersDto;
import com.olegpruh.bookstore.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookSpecificationBuilder implements SpecificationBuilder<Book> {
    private BookSpecificationProviderManager bookSpecificationProviderManager;

    @Override
    public Specification<Book> build(BookSearchParametersDto searchParameters) {
        Specification<Book> specification = Specification.where(null);
        if (searchParameters.getAuthors() != null && searchParameters.getAuthors().length > 0) {
            specification.and(bookSpecificationProviderManager.getSpecificationProvider("author")
                    .getSpecification(searchParameters.getAuthors()));
        }
        return specification;
    }
}
