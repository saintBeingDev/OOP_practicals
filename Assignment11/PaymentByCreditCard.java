package Assignment11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class CreditCard {
    private double card_no;
    private int cvv;
    private Date expDate;

    CreditCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter credit card No: ");
        this.card_no = scanner.nextDouble();

        System.out.print("Enter cvv: ");
        this.cvv = scanner.nextInt();

        System.out.print("Enter the Date in [dd-MM-yyyy] ");

        String date = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date2=null;
        try {
            //Parsing the String
            date2 = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        expDate = date2;
    }
}

public class PaymentByCreditCard implements PaymentStrategy{
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard();
    }

    @Override
    public void pay(int amount) {
        System.out.println("----------------------------");
        System.out.println("BILL");
        System.out.println("Paying Rs."+amount);
        System.out.println("Mode of payment: CreditCard");
        System.out.println("Status of payment: Success !!");
        System.out.println("Thanks for purchasing from our store ");
        System.out.println("----------------------------");

    }
}
