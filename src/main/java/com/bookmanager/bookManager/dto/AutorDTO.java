package com.bookmanager.bookManager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AutorDTO {

    private Long id;

    @NotBlank
    @Size(max=60)
    private String nome;

    @NotBlank
    @Size(max=100)
    private String sobrenome;

    @NotNull
    @Size(max=100)
    private Integer idade;

}
