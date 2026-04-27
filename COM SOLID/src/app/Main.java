package src.app;
import java.util.Scanner;
import src.model.*;
import src.service.*;
import src.service.impl.*;
import src.repository.*;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        IPedidoRepository repo = new InMemoryPedidoRepository();
        ValorPedido calc = new ValorPedido();
        INotificacao wpp = new NotificacaoWpp();
        IPedidoService service = new PedidoServiceImpl(calc, wpp, repo);

        System.out.println("--- SISTEMA DE ENCOMENDAS DA CONFEITARIA ---");
        System.out.print("Cliente: ");
        String nomeCliente=input.nextLine();

        System.out.print("Data de recebimento esperada: ");
        String dataEsperada=input.nextLine();

        Pedido pedido = new Pedido(nomeCliente, dataEsperada);
        boolean maisalgumacoisa=true;
        
        while (maisalgumacoisa){
            System.out.print("Digite o nome do produto desejado: ");
            String nomeproduto=input.nextLine();

            System.out.print("Digite o preço do produto desejado: ");
            Double precoproduto=input.nextDouble();

            input.nextLine();

            pedido.adicionarItem(new Item(nomeproduto, precoproduto));

            System.out.print("Deseja mais alguma coisa? (Sim/Não)");
            String resposta=input.nextLine();

            if (resposta.equals("Não")) maisalgumacoisa=false; break;
        }
        
        System.out.print("Pagamento (1-Pix / 2-Cartão / 3-Dinheiro): ");
        IMetodoPagamento pag =(input.nextInt() == 1) ? new PagamentoPix() : (input.nextInt() == 2) ? new PagamentoCartao() : new PagamentoDinheiro();
        
        service.fecharPedido(pedido, pag, 5.0);
    }
}

