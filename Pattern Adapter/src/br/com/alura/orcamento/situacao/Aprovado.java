package br.com.alura.orcamento.situacao;

import br.com.alura.DomainException;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{
    public BigDecimal calcularValorDescontoExtra (Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituação(new Finalizado());
    }
}
