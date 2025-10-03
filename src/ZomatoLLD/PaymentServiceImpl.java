package ZomatoLLD;

public class PaymentServiceImpl implements PaymentService{

    @Override
    public void pay(int amt) {
        System.out.println(amt + " rs is paid.");
    }
}
