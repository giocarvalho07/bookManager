package com.bookmanager.bookManager.service;

import com.bookmanager.bookManager.dto.LivroDTO;
import com.bookmanager.bookManager.dto.MensagemResponseDTO;
import com.bookmanager.bookManager.entity.Livro;
import com.bookmanager.bookManager.mapper.LivroMapper;
import com.bookmanager.bookManager.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    private final LivroMapper livroMapper = LivroMapper.INSTANCE;

    public MensagemResponseDTO create(LivroDTO livroDTO){
        Livro livroToSave = livroMapper.toModel(livroDTO);
        Livro criarLivro = livroRepository.save(livroToSave);
        return MensagemResponseDTO.builder().mensagem(
                "Livro criado com sucesso - Id " + criarLivro.getId() + ", nome: " + criarLivro.getNome()).build();
    }

}
