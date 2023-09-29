package com.olegpruh.bookstore.dto.request;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateBookRequestDto {
    @NotBlank
    private String title;
    @NotBlank
    private String author;
    @NotBlank
    @Column(unique = true)
    private String isbn;
    @Min(value = 0)
    @Column(nullable = false)
    private BigDecimal price;
    private String description;
    private String coverImage;
}
