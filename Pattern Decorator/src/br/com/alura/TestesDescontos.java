package br.com.alura;

import br.com.alura.desconto.CalculadoraDeDescontos;
import br.com.alura.imposto.CalculadoraDeImposto;
import br.com.alura.imposto.ICMS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args){
        Orcamento primOrcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segOrcamento = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primOrcamento));
        System.out.println(calculadora.calcular(segOrcamento));
    }
}