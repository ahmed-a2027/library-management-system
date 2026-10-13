package com.library.managment_system.service;

import com.library.managment_system.entity.Author;
import com.library.managment_system.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public Author createAuthor(Author author) {

        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(UUID id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Author not found"));
    }

    public Author updateAuthor(UUID id, Author updatedAuthor) {

        Author author = getAuthorById(id);

        author.setName(updatedAuthor.getName());
        author.setBio(updatedAuthor.getBio());

        return authorRepository.save(author);
    }

    public void deleteAuthor(UUID id) {

        Author author = getAuthorById(id);

        authorRepository.delete(author);
    }
}
