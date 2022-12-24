package Assignment11;

public interface PaymentStrategy {
    public void collectPaymentDetails();
    public void pay(int amount);
}
