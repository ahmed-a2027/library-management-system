package com.library.managment_system.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
public class BookResponse {

    private UUID id;

    private String title;
    private String isbn;
    private String description;

    private int publicationYear;
    private int totalCopies;
    private int availableCopies;

    private UUID authorId;
    private String authorName;

    private UUID categoryId;
    private String categoryName;

    private LocalDateTime createdAt;
}
