package src.service;
import src.model.Item;
import src.model.Pedido;

public class ValorPedido {
    public double calcularTotal(Pedido pedido) {
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        if (total < 100) total += 10;
        return total;
    }

    public double aplicarDesconto(double total, double percentual) {
        return total - (total * percentual / 100);
    }
}
