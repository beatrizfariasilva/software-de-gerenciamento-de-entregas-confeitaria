package src;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("--- SISTEMA DE ENCOMENDAS DA CONFEITARIA ---");
        
        System.out.print("Cliente: ");
        String nomeCliente=input.nextLine();

        System.out.print("Data de recebimento esperada: ");
        String dataEsperada=input.nextLine();

        Sistema sistema = new Sistema(nomeCliente, dataEsperada);
        
        sistema.adicionarItem("Bolo de Pote de Churros", 10.90);
        
        System.out.print("Forma de pagamento (Pix/Cartão/Dinheiro): ");
        String pag=input.nextLine();
        
        sistema.finalizarPedido(pag, 5.0);
    }
}
    


