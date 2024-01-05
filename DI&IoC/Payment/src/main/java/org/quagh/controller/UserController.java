package org.quagh.controller;

import org.quagh.service.PaymentService;

public class UserController {
    private PaymentService paymentService;

    public UserController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void payTheBill(int amount){
        paymentService.pay(amount);
    }
}
