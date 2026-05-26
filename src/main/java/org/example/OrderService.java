package org.example;

public class OrderService{
    PaymentService payment;

    public OrderService(PaymentService payment){
        this.payment = payment;
    }
    public void orderUpdated(){
        System.out.println("Order updated");
        payment.pay();
    }
}
