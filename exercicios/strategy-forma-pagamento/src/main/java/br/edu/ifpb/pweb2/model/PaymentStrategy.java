package br.edu.ifpb.pweb2.model;

public interface PaymentStrategy {
    void processPayment(double amount);
}
