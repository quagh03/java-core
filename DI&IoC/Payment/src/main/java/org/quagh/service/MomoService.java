package org.quagh.service;

public class MomoService implements PaymentService{
    @Override
    public void pay(int amount){
        System.out.printf("Paid: %d with Momo", amount);
        System.out.println();
    }
}
