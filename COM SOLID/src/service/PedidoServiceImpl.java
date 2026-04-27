package src.service;
import src.model.Pedido;
import src.repository.IPedidoRepository;

public class PedidoServiceImpl implements IPedidoService {
    private ValorPedido calculadora; 
    private INotificacao notificacao; 
    private IPedidoRepository repository; 

    public PedidoServiceImpl(ValorPedido calculadora, INotificacao notificacao, IPedidoRepository repository) {
        this.calculadora=calculadora;
        this.notificacao=notificacao;
        this.repository=repository;
    }

    @Override
    public void fecharPedido(Pedido pedido, IMetodoPagamento pagamento, double desconto) {
        double total = calculadora.calcularTotal(pedido);
        total = calculadora.aplicarDesconto(total, desconto);
        
        pagamento.pagar(total); 
        repository.salvar(pedido);
        
        notificacao.enviar("Confirmado para " + pedido.getDataEntrega());
    }
}