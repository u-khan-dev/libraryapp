package dev.umarkhan.sampleproject.controller;

import dev.umarkhan.sampleproject.model.Book;
import dev.umarkhan.sampleproject.repository.LibraryCollectionRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    private final LibraryCollectionRepo libraryRepo;

    public LibraryController(LibraryCollectionRepo libraryRepo) {
        this.libraryRepo = libraryRepo;
    }

    // make a request find all books
    @CrossOrigin(
            origins="http://localhost:5173",
            allowedHeaders = "*"
    )
    @GetMapping("")
    public List<Book> findAllBooks() {
        return libraryRepo.findAll();
    }
}
