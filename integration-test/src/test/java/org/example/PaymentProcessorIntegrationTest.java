package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorIntegrationTest {
    @Test
    public void testProcessPayment() {

        PaymentProcessor.PaymentGateway paymentGateway = new MockPaymentGateway();


        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);


        boolean paymentResult = paymentProcessor.processPayment(105.0);
        assertTrue(paymentResult);
    }

}