package com.library.managment_system.controller;

import com.library.managment_system.dto.BookRequest;
import com.library.managment_system.dto.BookResponse;
import com.library.managment_system.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/books")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponse> createBook(@Valid @RequestBody BookRequest request) {

        BookResponse response = bookService.createBook(request);

        return ResponseEntity.ok(response);
    }

}
