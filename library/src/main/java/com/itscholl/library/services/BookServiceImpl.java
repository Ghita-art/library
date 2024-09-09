package com.itscholl.library.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itscholl.library.models.dtos.BookDTO;
import com.itscholl.library.models.entities.Book;
import com.itscholl.library.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookServiceImpl implements BookService {

    private final ObjectMapper objectMapper;
    private final BookRepository bookRepository;

    public BookServiceImpl(ObjectMapper objectMapper, BookRepository bookRepository) {
        this.objectMapper = objectMapper;
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book bookEntity = objectMapper.convertValue(bookDTO, Book.class);
        Book bookEntityResponse = bookRepository.save(bookEntity);
        log.info("Book with id {} was saved", bookEntityResponse.getId());

        return objectMapper.convertValue(bookEntityResponse, BookDTO.class);
    }
}
