package Assignment09.BankingPolymorphism;

import java.util.Date;
import java.util.Scanner;

public abstract class Account {
    Scanner sc = new Scanner(System.in);
    Scanner sc_str = new Scanner(System.in);
    private String name;
    private int age;
    private Date date;
    private double balance;
    private String acountType;

    public String getAcountType() {
        return acountType;
    }

    public void setAcountType(String acountType) {
        this.acountType = acountType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public double getBalance() {
        return balance;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDate() {
        date = new Date();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Methods
    public  void createAccount(){
        System.out.println("-------------------------------------------------");
        System.out.println("CREATING ACCOUNT");
        System.out.println("-------------------------------------------------");
        System.out.print("Enter name: ");
        setName(sc_str.nextLine());
        System.out.print("Enter Age: ");
        setAge(sc.nextInt());
        setDate();
        System.out.print("Enter account type: ");
        System.out.println("""
                1.Saving
                2.PF
                3.Current""");
        int ch = sc.nextInt();
        switch (ch){
            case 1->{
                setAcountType("Saving");
            }case 2->{
                setAcountType("PF");
            }case 3->{
                setAcountType("Current");
            }default -> {
                System.out.println("Enter valid choice");
            }
        }
        do {
            System.out.println("Basic balance: ");
            balance = sc.nextDouble(); // initial deposit (must be minimum Rs.1000)
            if (balance < 1000) {
                System.out.println("Initial balance should be minimum Rs.1000!");
            }
            else {
                System.out.println("--------------------------------------");
                System.out.println("Account created!");
                System.out.println("--------------------------------------");
            }
        } while (balance < 1000);


    }

    public void showDetails(){
        System.out.println("----------------------------------------------------");
        System.out.println("ACCOUNT HOLDER INFORMATION");
        System.out.println("----------------------------------------------------");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Account created on: "+ getDate());
        System.out.println("Account type: "+getAcountType());
        System.out.println("Balance: "+getBalance());
        System.out.println("----------------------------------------------------");
    }

    public void deposit() {
        long amount = 0;
        System.out.print("Enter amount you want to deposit: ");
        amount = sc.nextLong();
        balance += amount;
    }

    public void withDrawMoney(){
        long witAmt = 0;//4000
        do{
            System.out.println("Enter amount you want to withdraw");
            witAmt = sc.nextLong();
            if((witAmt > (balance-1000))){ //4000 > 5000
                System.out.println("You cannot withdraw money below minimum withdrawal amount");
            }else{
                break;
            }
        }while((witAmt > (balance-1000)));
        balance -= witAmt;
        System.out.println("----------------------------------------------------");
        System.out.println("Amount Withdrew successfully!");
        System.out.println("----------------------------------------------------");

    }
}
