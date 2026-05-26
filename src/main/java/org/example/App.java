package org.example;

public class App {
    public static void main(String[] args) {
        PaymentService payment = new PayPalPayment();
        OrderService order = new OrderService(payment);
        order.orderUpdated();
    }
}