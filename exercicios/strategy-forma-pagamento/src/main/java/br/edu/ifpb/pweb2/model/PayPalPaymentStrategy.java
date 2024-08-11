package br.edu.ifpb.pweb2.model;

public class PayPalPaymentStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processando pagamento de $" + amount + " via PayPal com o email " + email);
    }
}
