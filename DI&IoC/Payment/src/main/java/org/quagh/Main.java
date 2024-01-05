package org.quagh;

import org.quagh.controller.UserController;
import org.quagh.service.MomoService;
import org.quagh.service.PaymentService;
import org.quagh.service.TechcombankService;

import javax.management.InstanceNotFoundException;

public class Main {
    public static void main(String[] args) throws InstanceNotFoundException {
        //Dependencies Injection Demo
        //Create Momo Service
        PaymentService momoService = new MomoService();
        //Create Techcombank Service
        PaymentService techcombankService = new TechcombankService();
        //Constructor Injection (inject momoService)
        UserController userControllerDI = new UserController(momoService);
        //Pay with Momo
        userControllerDI.payTheBill(100000);
        //Setter Injection (inject techcombankService)
        userControllerDI.setPaymentService(techcombankService);
        //Pay with Techcombank
        userControllerDI.payTheBill(200000);

        //IoC Demo
        PaymentService paymentService = (PaymentService) Injector.getInstance("paymentService");
        UserController userControllerIoC = new UserController(paymentService);
        userControllerIoC.payTheBill(100000);
    }
}