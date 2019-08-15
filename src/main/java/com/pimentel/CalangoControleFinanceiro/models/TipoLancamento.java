package com.pimentel.CalangoControleFinanceiro.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoLancamento {

	DEBITO("Débito"), CREDITO("Crédito"), INVESTIMENTO("Investimento");

	private String descricaoTipoLancamento;

}
