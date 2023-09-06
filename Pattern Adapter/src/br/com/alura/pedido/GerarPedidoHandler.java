package br.com.alura.pedido;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.pedido.acao.AcaoAposGerarPedido;
import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidoHandler{

    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {

        this.acoes = acoes;
    }

    public void execute(GerarPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
