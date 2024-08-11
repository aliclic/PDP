package br.edu.ifpb.pweb2.model;

public class Order {
    private double amount;
    private PaymentStrategy paymentStrategy;

    public Order(double amount) {
        this.amount = amount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        if (paymentStrategy != null) {
            paymentStrategy.processPayment(amount);
        } else {
            System.out.println("Método de pagamento não selecionado.");
        }
    }
}