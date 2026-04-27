package src.service;
import src.model.Pedido;

public interface IPedidoService {
    void fecharPedido(Pedido pedido, IMetodoPagamento pagamento, double desconto);
}
