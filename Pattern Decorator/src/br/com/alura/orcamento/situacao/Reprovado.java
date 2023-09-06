package br.com.alura.orcamento.situacao;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento{
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituação(new Finalizado());
    }
}
