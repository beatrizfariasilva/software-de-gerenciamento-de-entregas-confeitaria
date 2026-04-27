package src.service.impl;

import src.service.IMetodoPagamento;

public class PagamentoDinheiro implements IMetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento em dinheiro na entrega: R$" + valor);
    }
}
