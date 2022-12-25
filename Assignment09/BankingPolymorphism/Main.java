package Assignment09.BankingPolymorphism;


import Assignment09.BankingSystem.Account;

import java.util.Scanner;

// 1. Create an account
// 2. Deposit money
// 3. Withdraw money
// 4. Honor daily withdrawal limit
// 5. Check the balance
// 6. Display Account information

/**
 * Things to remember: Withdraw money formula else part has break
 * 2. Daily withdrawal limit is inside main
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment09.BankingSystem.Account ac = new Account();
        System.out.println("--------------------------------------------");
        System.out.println("WELCOME TO BANK OF MAHARASHTRA");
        System.out.println("--------------------------------------------");


        boolean flag = true;
        int dailyWithdrawalLimit =0;
        do{
            System.out.println("""
                    ===============MENU====================
                    1.Create account
                    2.Deposit money
                    3.Withdraw money
                    4.Check Balance
                    5.Display Account information
                    0.Exit
                    ======================================""");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1->{
                    ac.createAccount();
                }
                case 2->{
                    ac.deposit();
                }
                case 3->{
                    dailyWithdrawalLimit++;
                    if(dailyWithdrawalLimit>2){
                        System.out.println("**********************************************");
                        System.out.println("You can only withdraw money 2 times a day");
                        System.out.println("**********************************************");
                        System.out.println("**********************************************");
                        break;
                    }
                    ac.withDrawMoney();
                }
                case 4->{
                    System.out.println("----------------------------------------------------");
                    System.out.println("Balance: "+ ac.getBalance());
                    System.out.println("----------------------------------------------------");
                }
                case 5->{
                    ac.showDetails();
                }
                case 0->{
                    flag = false;
                }
                default -> {
                    System.out.println("Thanks for using our services...");
                }
            }
        }while(flag);
    }
}
