package com.bookmanager.bookManager.service;

import com.bookmanager.bookManager.dto.MensagemResponseDTO;
import com.bookmanager.bookManager.entity.Livro;
import com.bookmanager.bookManager.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private LivroRepository livroRepository;

    public MensagemResponseDTO create(Livro livro){
        Livro criarLivro = livroRepository.save(livro);
        return MensagemResponseDTO.builder().mensagem("Livro criado com sucesso - Id " + criarLivro.getId() + ", nome: " + criarLivro.getNome()).build();
    }

}
