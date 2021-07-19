package com.bookmanager.bookManager.controller;

import com.bookmanager.bookManager.dto.MensagemResponseDTO;
import com.bookmanager.bookManager.entity.Livro;
import com.bookmanager.bookManager.repository.LivroRepository;
import com.bookmanager.bookManager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping
    public MensagemResponseDTO create(@RequestBody Livro livro){
        return bookService.create(livro);
    }
}
