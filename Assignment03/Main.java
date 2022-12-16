package Assignment03;

import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        int flag=0;
        while(flag!=-1)
        {
            System.out.println("Enter 1 if the employee's designation is Programmer.");
            System.out.println("Enter 2 if the employee's designation is Team Lead.");
            System.out.println("Enter 3 if the employee's designation is Assistant Product Manager.");
            System.out.println("Enter 4 if the employee's designation is Product Manager.");
            System.out.println("Enter the number corresponding to the designation: ");
            Scanner get = new Scanner(System.in);
            int x = get.nextInt();
            switch (x) {
                case 1 -> {
                    Programmer ob1 = new Programmer();
                    ob1.hello1();
                    ob1.displayemployeedeatils();
                    ob1.display();
                }
                case 2 -> {
                    TeamLead ob2 = new TeamLead();
                    ob2.hello2();
                    ob2.displayemployeedeatils();
                    ob2.display();
                }
                case 3 -> {
                    AsstProductManager ob3 = new AsstProductManager();
                    ob3.hello3();
                    ob3.displayemployeedeatils();
                    ob3.display();
                }
                case 4 -> {
                    ProductManager ob4 = new ProductManager();
                    ob4.hello4();
                    ob4.displayemployeedeatils();
                    ob4.display();
                }
                default -> System.out.println("Please enter a valid number.");
            }
            System.out.println("\n -1 to exit and for any other input continue.");
            flag = get.nextInt();
        }
    }
}