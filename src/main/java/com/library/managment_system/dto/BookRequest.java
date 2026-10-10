package com.library.managment_system.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class BookRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String isbn;

    private String description;

    @Min(0)
    private int publicationYear;

    @Min(0)
    private int totalCopies;

    @NotNull
    private UUID authorId;

    @NotNull
    private UUID categoryId;
}
