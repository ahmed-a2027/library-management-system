package com.library.managment_system.controller;

import com.library.managment_system.dto.BookRequest;
import com.library.managment_system.dto.BookResponse;
import com.library.managment_system.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponse> createBook(@Valid @RequestBody BookRequest request) {

        BookResponse response = bookService.createBook(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);    }

    @GetMapping
    public List<BookResponse> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookResponse getBookById(@PathVariable UUID id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    public BookResponse updateBook(@PathVariable UUID id, @Valid @RequestBody BookRequest request) {
        return bookService.updateBook(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable UUID id) {

        bookService.deleteBook(id);

        return ResponseEntity.noContent().build();

    }

}
