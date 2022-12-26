package Assignment03;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    Scanner sc_str = new Scanner(System.in);
    String name, mailId, address;
    double mobile, basic_pay, gross_salary;
    int emp_id;
// Basic salary for each designation is taken through constructor
    void salary(){
        double da, hra, pf, cf;
        da = basic_pay * 97/100;
        hra = basic_pay * 10/100;
        pf = basic_pay * 12/100;
        cf = basic_pay * 0.1f/100;
        gross_salary = basic_pay + da + hra - pf - cf;
        setDetails();
        getDetails();
        System.out.println("Basic salary: " + basic_pay);
        System.out.println("Gross salary: " + Math.round(gross_salary));
    }

    void setDetails(){
        System.out.println("========================================");
        System.out.println("Enter Employee Details:");
        System.out.println("========================================");
        System.out.print("Enter emp id: ");
        emp_id = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc_str.nextLine();
        System.out.println("Enter email ID: ");
        mailId = sc_str.nextLine();
        System.out.print("Address: ");
        address = sc_str.nextLine();
        System.out.println("Enter mobile number: ");
        mobile = sc.nextDouble();
    }
    void getDetails(){
        System.out.println("========================================");
        System.out.println("Employee Details are:");
        System.out.println("========================================");
        System.out.println("Employee Name: "+name);
        System.out.println("Email ID: "+mailId);
        System.out.println("Contact Number: "+mobile);
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Address: "+address);
    }

}

class Programmer extends Employee{
    public Programmer(double sal) {
        basic_pay = sal;
    }
}
class TeamLead extends Employee{
    public TeamLead(double sal) {
        basic_pay = sal;
    }
}

class APM extends Employee{
    public APM(double sal) {
        basic_pay = sal;
    }
}
class ProjectManager extends Employee{
    public ProjectManager(double sal) {
        basic_pay = sal;
    }
}