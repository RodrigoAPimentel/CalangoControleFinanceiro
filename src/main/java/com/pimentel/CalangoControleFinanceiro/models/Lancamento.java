package com.pimentel.CalangoControleFinanceiro.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(exclude = "id")
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Lancamento implements Serializable {

	private static final long serialVersionUID = -1196058361968168912L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_LANCAMENTO", nullable = false)
	private TipoLancamento TipoLancamento;

	@Column(name = "VALOR_REAL")
	private Double valorReal;
	@Column(name = "VALOR_PREVISTO")
	private Double valorPrevisto;
	@Column(name = "VALOR_EXECUTADO")
	private Double valorExecutado;
	@Column(name = "VALOR_MINIMO")
	private Double valorMinimo;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "DATA_CADASTRO")
	private LocalDate dataCadastro;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "DATA_PREVISTA")
	private LocalDate dataPrevista;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "DATA_EXECUTADA")
	private LocalDate dataExecutada;

	private String descricao;
	private String observacao;

	@Lob
	@Column(name = "COMPROVANTE_1")
	private byte[] comprovante1;
	@Lob
	@Column(name = "COMPROVANTE_2")
	private byte[] comprovante2;

	private String nome;
	@OneToOne
	private Categoria categoria;

}
