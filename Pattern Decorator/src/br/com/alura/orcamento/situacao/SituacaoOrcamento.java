package br.com.alura.orcamento.situacao;

import br.com.alura.DomainException;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento{

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){

        return BigDecimal.ZERO;
    }
    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser reprovado!");
    }
    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado!");
    }
    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }

}
