package br.com.alura;

import br.com.alura.imposto.CalculadoraDeImposto;
import br.com.alura.imposto.ICMS;
import br.com.alura.imposto.Imposto;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}