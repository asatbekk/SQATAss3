package org.example;

public class MockPaymentGateway implements PaymentProcessor.PaymentGateway {
    @Override
    public boolean charge(double amount) {
        return true;
    }
}
