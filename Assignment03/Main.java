package Assignment03;

import java.util.Scanner;

//Design and develop inheritance for a given case study, identify objects and relationships and
//        implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project
//        Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the
//        inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff
//        club fund. Generate pay slips for the employees with their gross and net salary
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        boolean flag = true;
        do{
            System.out.println("""
                    1.Programmer
                    2.TeamLead
                    3.Assistant project manger
                    4.Project Manager""");
            int ch = sc.nextInt();
            switch (ch){
                case 1->{
                    System.out.print("Enter basic salary for programmer");
                    double sal = sc.nextDouble();
                    Programmer p = new Programmer(sal);
                    p.salary();
                }
                case 2->{
                    System.out.print("Enter basic salary for team lead");
                    double sal = sc.nextDouble();
                    TeamLead p = new TeamLead(sal);
                    p.salary();
                }
                case 3->{
                    System.out.print("Enter basic salary for assistant project manager");
                    double sal = sc.nextDouble();
                    APM p = new APM(sal);
                    p.salary();
                }
                case 4->{
                    System.out.print("Enter basic salary for project manager");
                    double sal = sc.nextDouble();
                    ProjectManager p = new ProjectManager(sal);
                    p.salary();
                }
                default -> {
                    System.out.println("Enter valid choice");
                }
            }
            System.out.println("Do you want to continue:[y/n]");
            char c = sc.next().charAt(0);
            if(c == 'n' || c == 'N') flag = false;
        }while(flag);
    }
}
