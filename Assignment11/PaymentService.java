package Assignment11;

import java.util.Scanner;

public class PaymentService {
    static int shopping(){
        System.out.println("=================================");
        System.out.println("WELCOME TO GADA ELECTRONICS STORE");
        System.out.println("=================================");
        System.out.println("""
                1.Laptop: 32,000
                2.Mouse: 5,000
                3.Keyboard: 4,500""");
        System.out.print("\nWhat do you want to purchase:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amount=0;
        switch (n){
            case 1->{
                amount = 32000;
            }case 2->{
                amount = 5000;
            }case 3->{
                amount = 4500;
            }default -> {
                System.out.println("Enter valid choice");
            }
        }
        return amount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        do{
            int amount = shopping();
            System.out.println("---------------------------");
            System.out.println("Enter payment method:");
            System.out.println("""
                   1. Credit card
                   2. Pay pal
                   3. Bit coin
               """);
            int choice;
            choice = sc.nextInt();
            switch (choice){
                case 1->{
                    PaymentByCreditCard payByCard = new PaymentByCreditCard();
                    payByCard.collectPaymentDetails();
                    payByCard.pay(amount);
                }
                case 2->{
                    PaymentByPayPal paybyPal = new PaymentByPayPal();
                    paybyPal.collectPaymentDetails();
                    paybyPal.pay(amount);
                }
                case 3->{
                    PaymentByBitcoin payByBitcoin = new PaymentByBitcoin();
                    payByBitcoin.collectPaymentDetails();
                    payByBitcoin.pay(amount);
                }
                default -> {
                    System.out.println("Enter valid choice..");
                }
            }

            System.out.println("Do you want to continue shopping: [y/n]");
            char s = sc.next().charAt(0);
            if(s == 'n' || s == 'N')flag= 0;
        }while(flag!=0);



    }
}