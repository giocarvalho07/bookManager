package com.bookmanager.bookManager.repository;

import com.bookmanager.bookManager.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository< Livro, Long> {
}
