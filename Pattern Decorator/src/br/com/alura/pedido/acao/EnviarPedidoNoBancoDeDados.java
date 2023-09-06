package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class EnviarPedidoNoBancoDeDados implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido){

        System.out.println("Enviando emails com dados do pedido!");
    }
}
