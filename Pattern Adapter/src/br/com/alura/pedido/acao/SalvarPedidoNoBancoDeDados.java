package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido){

        System.out.println("Salvando emails com dados do pedido!");
    }
}
