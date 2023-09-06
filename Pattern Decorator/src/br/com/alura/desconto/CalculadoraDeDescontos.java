package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDescontos = new OrcamentoMaisDeCincoItens(
                new OrcamentoValorMaiorQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDescontos.efetuarCalculo(orcamento);
    }

}
