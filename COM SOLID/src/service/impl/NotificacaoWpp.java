package src.service.impl;

import src.service.INotificacao;

public class NotificacaoWpp implements INotificacao {
    public void enviar(String status) {
        System.out.println("Acompanhe o andamento do seu pedido");
        System.out.println("   Seu pedido está: " + status);
    }
}
