package br.edu.ifpb.pweb2.main;

import br.edu.ifpb.pweb2.model.CreditCardPaymentStrategy;
import br.edu.ifpb.pweb2.model.Order;
import br.edu.ifpb.pweb2.model.PayPalPaymentStrategy;

public class Client {
    public static void main(String[] args) {
        Order order = new Order(100.0);

        System.out.println("Escolha a forma de pagamento: (1) PayPal (2) Cartão de Crédito");
        String choice = "1";

        switch (choice) {
            case "1":
                order.setPaymentStrategy(new PayPalPaymentStrategy("cliente@example.com", "senha123"));
                break;
            case "2":
                order.setPaymentStrategy(new CreditCardPaymentStrategy("1234-5678-9876-5432", "12/24", "123"));
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }

        order.processOrder();
    }
}
