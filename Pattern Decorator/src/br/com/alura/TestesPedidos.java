package br.com.alura;

import br.com.alura.pedido.GerarPedido;
import br.com.alura.pedido.GerarPedidoHandler;
import br.com.alura.pedido.acao.EnviarPedidoNoBancoDeDados;
import br.com.alura.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Guilherme";
        BigDecimal valorOrcamento = new BigDecimal("2000");
        int quantidadeDeItens = Integer.parseInt("2");

        GerarPedido gerador = new GerarPedido(cliente, quantidadeDeItens, valorOrcamento);
        GerarPedidoHandler handler = new GerarPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                        new EnviarPedidoNoBancoDeDados()
                ));
        handler.execute(gerador);
    }
}