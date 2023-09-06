package br.com.alura.orcamento.situacao;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{
    public BigDecimal calcularValorDescontoExtra (Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSituação(new Aprovado());
    }

    public void reprovar(Orcamento orcamento) {
        orcamento.setSituação(new Reprovado());
    }
}
