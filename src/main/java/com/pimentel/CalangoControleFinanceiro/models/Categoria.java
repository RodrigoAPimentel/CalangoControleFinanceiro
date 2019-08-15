package com.pimentel.CalangoControleFinanceiro.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@EqualsAndHashCode(exclude = "id")
public class Categoria implements Serializable {

	private static final long serialVersionUID = 9185007289538390707L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;
	private String nome;
	private String descricao;
	private String observacao;

}
