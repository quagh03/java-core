package Service;

public class TechcombankService implements PaymentService{

    @Override
    public void pay(int amount) {
        System.out.printf("Paid: %d with Techcombank", amount);
    }
}
