package org.example;

public class PayPalPayment implements PaymentService {
    public void pay() {
        System.out.println("Paid via PayPal!");
    }
}
