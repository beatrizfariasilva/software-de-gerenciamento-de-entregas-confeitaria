package src.repository;

import src.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class InMemoryPedidoRepository implements IPedidoRepository {
    private List<Pedido> pedidos = new ArrayList<>();

    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido salvo com sucesso no sistema.");
    }
}

