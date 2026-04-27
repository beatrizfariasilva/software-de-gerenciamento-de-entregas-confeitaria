package src.service.impl;

import src.service.IMetodoPagamento;

public class PagamentoCartao implements IMetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento no cartão aprovado: R$" + valor);
    }
}
