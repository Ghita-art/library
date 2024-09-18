package com.itscholl.library.controllers;

import com.itscholl.library.models.dtos.BookDTO;
import com.itscholl.library.models.dtos.RequestBookDTO;
import com.itscholl.library.models.dtos.ResponseBookDTO;
import com.itscholl.library.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/api/books")
    public ResponseEntity<ResponseBookDTO> createBook(@RequestBody RequestBookDTO requestBookDTO){
        return ResponseEntity.ok(bookService.createBook(requestBookDTO));
    }
}