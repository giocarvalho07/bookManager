package com.bookmanager.bookManager.dto;

import com.bookmanager.bookManager.entity.Autor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivroDTO {

    private Long id;

    @NotBlank
    @Size(max=100)
    private String nome;

    @NotNull
    private Integer paginas;

    @NotNull
    private Integer capitulos;

    @NotBlank
    @Size(max=100)
    @Pattern(regexp = "(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$",
        message = "Formato inválido de ISBN")
    private String isbn;

    @NotBlank
    @Size(max = 200)
    private String editora;

    @NotNull
    @Valid
    private Autor autor;
}
