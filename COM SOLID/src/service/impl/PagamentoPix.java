package src.service.impl;

import src.service.IMetodoPagamento;

public class PagamentoPix implements IMetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX confirmado: R$" + valor);
    }
}

