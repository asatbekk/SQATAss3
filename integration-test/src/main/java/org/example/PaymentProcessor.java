package org.example;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }



    public boolean processPayment(double amount) {
        // Some processing logic
        return paymentGateway.charge(amount);
    }
    public interface PaymentGateway {
        boolean charge(double amount);
    }

}
