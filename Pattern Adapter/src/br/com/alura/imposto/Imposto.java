package br.com.alura.imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcula (Orcamento orcamento);
}
