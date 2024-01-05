import Controller.UserController;
import Service.MomoService;
import Service.PaymentService;
import Service.TechcombankService;

public class Main {
    public static void main(String[] args) {
        //Create PaymentService
        PaymentService momoService = new MomoService();
        PaymentService techcombankService = new TechcombankService();

        //Create an UserController, using constructor injection
        UserController userController = new UserController(momoService);

        //Pay 100.000VND bill with Momo
        userController.payTheBill(100000);

        //Using Setter injection
        userController.setPaymentService(techcombankService);

        System.out.println();

        //Pay 200.000VND bill with Techcombank
        userController.payTheBill(200000);
    }

}