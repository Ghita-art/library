package com.itscholl.library.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itscholl.library.models.dtos.BookDTO;
import com.itscholl.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {

    private final ObjectMapper objectMapper;

    private final BookRepository bookRepository;

@Autowired
    public BookServiceImpl(ObjectMapper objectMapper, BookRepository bookRepository) {
        this.objectMapper = objectMapper;
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDTO createBook(BookDTO bookDTO){
        return null;
    }
}
