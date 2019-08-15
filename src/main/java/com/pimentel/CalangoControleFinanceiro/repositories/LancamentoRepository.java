package com.pimentel.CalangoControleFinanceiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pimentel.CalangoControleFinanceiro.models.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
