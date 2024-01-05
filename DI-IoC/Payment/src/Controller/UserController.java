package Controller;

import Service.PaymentService;

public class UserController {
    private PaymentService paymentService;

    //Constructor Injection
    public UserController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    //Setter Injection
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //pay method
    public void payTheBill(int amount){
        paymentService.pay(amount);
    }
}
