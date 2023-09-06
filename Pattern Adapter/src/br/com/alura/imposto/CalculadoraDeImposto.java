package br.com.alura.imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular (Orcamento orcamento, Imposto Imposto) {
        return Imposto.calcula(orcamento);
    }
}
