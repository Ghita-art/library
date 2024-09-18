package com.itscholl.library.services;

import com.itscholl.library.models.dtos.BookDTO;
import com.itscholl.library.models.dtos.RequestBookDTO;
import com.itscholl.library.models.dtos.ResponseBookDTO;
import com.itscholl.library.models.entities.Book;

public interface BookService {

    BookDTO createBook(BookDTO bookDTO);

    ResponseBookDTO createBook(RequestBookDTO requestBookDTO);
}
