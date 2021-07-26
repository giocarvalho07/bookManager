package com.bookmanager.bookManager.controller;

import com.bookmanager.bookManager.dto.LivroDTO;
import com.bookmanager.bookManager.dto.MensagemResponseDTO;
import com.bookmanager.bookManager.entity.Livro;
import com.bookmanager.bookManager.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public MensagemResponseDTO create(@RequestBody @Valid LivroDTO livroDTO){
        return livroService.create(livroDTO);
    }
}
