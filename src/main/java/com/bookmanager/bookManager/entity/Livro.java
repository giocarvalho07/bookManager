package com.bookmanager.bookManager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false)
    private String nome;

    @Column(nullable = false)
    private Integer paginas;

    @Column(nullable = false)
    private Integer capitulos;

    @Column(nullable = false)
    private String isbr;

    @Column(nullable = false, unique = true)
    private String editora;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "autor_id")
    private Autor autor;
}
