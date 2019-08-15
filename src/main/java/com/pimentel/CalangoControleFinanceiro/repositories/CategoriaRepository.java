package com.pimentel.CalangoControleFinanceiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pimentel.CalangoControleFinanceiro.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
