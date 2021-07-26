package com.bookmanager.bookManager.mapper;

import com.bookmanager.bookManager.dto.LivroDTO;
import com.bookmanager.bookManager.entity.Livro;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LivroMapper {

    LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);

    Livro toModel(LivroDTO livroDTO);

    LivroDTO toDTO(Livro livro);
}
