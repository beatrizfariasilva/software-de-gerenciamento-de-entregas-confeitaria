package src;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private String nomeCliente;
    private List<String> itens = new ArrayList<>();
    private List<Double> precos = new ArrayList<>();
    private double total = 0;
    private String dataEntrega;

    private static List<String> bancoDeDados= new ArrayList<>();

    public Sistema(String nomeCliente, String dataEntrega) {
        this.nomeCliente=nomeCliente;
        this.dataEntrega=dataEntrega;
    }

    public void adicionarItem(String nome, double preco) {
        itens.add(nome);
        precos.add(preco);
        System.out.println("Item adicionado: " + nome);
    }

    public void finalizarPedido(String tipoPagamento, double desconto) {
        total = 0;
        for (double p : precos) total += p;
        if (total < 100) total += 10; //fixei uma taxa de entrega de 10 reais
        
        total = total - (total * desconto / 100);


        switch (tipoPagamento.toLowerCase()) {
            case "pix": System.out.println("Pagamento via PIX: R$" + total);
            case "cartao": System.out.println("Pagamento no Cartão: R$" + total);
            default: System.out.println("Pagamento em Dinheiro: R$" + total);
        }

        String registro = "Cliente: " + nomeCliente + " | Total: " + total;
        bancoDeDados.add(registro);
        System.out.println("Pedido salvo no sistema.");
        
        System.out.println("Pedido confirmado no nome de " + nomeCliente + " e será entregue no dia " + dataEntrega);
    }
}