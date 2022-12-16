//package Assignment09;
//
//import java.util.Scanner;
//
//class Bank {
//    Scanner sc=new Scanner(System.in);  //creating object of scanner class
//    public SavingsAccount a=new SavingsAccount();    // creating object of SavingAccount class
//    public Customer c=new Customer();         //creating object of Customer class
//
//    public SavingsAccount createAccount(){  //method to create an Account
//        sc.nextLine();
//
//        System.out.print("Enter your name: ");    //printing on console
//        String customername=sc.nextLine();    //taking customername as input from user
//        c.setCustomerName(customername); 	//calling setCustomerName method
//
//        System.out.print("Enter your age: ");     //printing on console
//        int customerage=sc.nextInt();          //taking customerage as input from user
//        if(customerage<18){//check whether the age is less than 18
//            do{
//                System.out.print("Minimum age should be 18 to create an account.\nPlease enter valid age: ");
//                customerage=sc.nextInt();
//            }while(customerage<18); //if age is less than 18
//        }
//        c.setCustomerAge(customerage); //calling setCustomerName method
//
//        a.setCustomerObject(c);//calling setCustomerName method
//
//        System.out.print("Enter your account Id: ");   //printing on console
//        int accountid=sc.nextInt(); //taking accountid as input from user
//        a.setAccountId(accountid); //calling setAccountId method
//
//        System.out.print("Enter your account type: ");   //printing on console
//        String accounttype=sc.next();  //taking accounttype as input from user
//        a.setAccountType(accounttype); //calling setAccountType method
//
//        System.out.print("Enter balance: ");  //printing on console
//        double balance=sc.nextDouble();//taking balance as input from user
//        a.setBalance(balance);//calling setBalance method
//
//        System.out.print("Enter minimum balance: ");  //printing on console
//        double minbalance=sc.nextDouble(); //taking minbalance as input from user
//        a.setMinimumBalance(minbalance); //calling setMinimumBalance method
//
//
//        return a;      //returning saving account
//    }
//
//
//    void getWithdrawAmount(){     //method to withdraw amount
//        System.out.print("Enter the amount you want to withdraw: ");  //printing on console
//        double amount=sc.nextDouble();           //taking amount as input from user
//        if(amount>20000){ //check whether amount is greater than 20000
//            System.out.println("Withdrawal failed. Maximum limit of withdrawal in one transaction is Rs.20000.");
//        }
//        else{  //if amount is less than 20000
//            if(a.withdraw(amount)==true){ //calling withdraw method
//                System.out.println("Withdrawal successful. Balance is: "+a.getBalance());
//            }
//            else
//                System.out.println("Sorry!!! Not enough balance"); //if not enough balance
//        }
//    }
//
//    public void depositAmount(double amount){ //method to deposit Amount
//        double bal=a.getBalance()+amount;    //previous balance + amount
//        a.setBalance(bal);  //call setBalance method
//        System.out.println("Amount deposited successfully. Balance is: "+a.getBalance());
//    }
//
//    public void checkBalance(){   //method to check Balance
//        System.out.println("Balance is: "+a.getBalance());//calling getbalance method
//    }
//    public void displayAccountInformation(){   //method to display Account Information
//        System.out.println("Welcome "+c.getCustomerName()+"! Following are your account details:");
//        //display name of customer
//        System.out.println("Age :"+c.getCustomerAge()); //display Age of customer
//        System.out.println("Account Id: "+a.getAccountId());      //display Account Id of customer
//        System.out.println("Account Type: "+a.getAccountType()); //display Account Type of customer
//        System.out.println("Balance: "+a.getBalance());     //display Balance of customer
//        System.out.println("Minimum balance: "+a.getMinimumBalance());  //display Minimum balance of customer
//    }
//}
//
