package src.model;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeCliente;
    private String dataEntrega;
    private List<Item> itens = new ArrayList<>();

    public Pedido(String nomeCliente, String dataEntrega) {
        this.nomeCliente = nomeCliente;
        this.dataEntrega = dataEntrega;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }
}