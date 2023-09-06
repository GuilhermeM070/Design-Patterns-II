package br.com.alura.pedido;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GerarPedido {
    private String cliente;
    private int quantidadeDeItens;
    private BigDecimal valorOrcamento;

    public GerarPedido(String cliente, int quantidadeDeItens, BigDecimal valorOrcamento) {
        this.cliente = cliente;
        this.quantidadeDeItens = quantidadeDeItens;
        this.valorOrcamento = valorOrcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void executa() {
    }
}
