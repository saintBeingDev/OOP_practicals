package Assignment11;

import java.util.Scanner;

public class PaymentByPayPal implements PaymentStrategy{
    Scanner sc = new Scanner(System.in);
    @Override
    public void collectPaymentDetails() {
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
    }

    @Override
    public void pay(int amount) {
        System.out.println("----------------------------");
        System.out.println("BILL");
        System.out.println("Paying Rs."+amount);
        System.out.println("Mode of payment: Pay Pal");
        System.out.println("Status of payment: Success !!");
        System.out.println("Thanks for purchasing from our store ");
        System.out.println("----------------------------");
    }
}
