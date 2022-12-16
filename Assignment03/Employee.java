package Assignment03;

import java.util.Scanner;

public class Employee{
        String name;
        String mailId;
        long num;
        String employeeId;
        String address;
        Scanner s = new Scanner(System.in);
        double BP;
 double DA;
         double HRA;
         double PF;
         double staffclubfund;
         double NS;
         double GS;
         int size = 0;
         Employee()
         {
         System.out.println("Enter name of the Employee: ");
         name = s.nextLine();
         System.out.println("Enter Employee Email ID: ");
         mailId = s.nextLine();
         System.out.println("Enter the Employee ID: ");
         employeeId = s.nextLine();
         System.out.println("Enter address of the Employee: ");
         address = s.nextLine();
         while(size != 10)
         {
         System.out.println("Enter a 10 digit contact number: ");
         num = s.nextLong();
         size = String.valueOf(num).length();
         }
         }
         void displayemployeedeatils()
         {
         System.out.println("""
                 ======================================
                 EMPLOYEE DETAILS
                 ======================================""");
         System.out.println("Employee Name: "+name);
         System.out.println("Email ID: "+mailId);
         System.out.println("Contact Number: "+num);
         System.out.println("Employee ID: "+employeeId);
         System.out.println("Address: "+address);
         }
         }

