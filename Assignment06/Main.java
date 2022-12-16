package Assignment06;

// Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user
// enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1
// and Num2 are not integers, the program would throw a Number Format Exception. If Num2
// were zero, the program would throw an Arithmetic Exception. Display the exception.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            try {
                System.out.println("Enter num 1: ");
                String a = sc.next();
                System.out.println("Enter num 2: ");
                String b = sc.next();

                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                System.out.println("Dividing " + num1 + " by " + num2);
                int c = num1 / num2;
                System.out.println("Result: " + c);
            } catch (ArithmeticException ae) {
                System.out.println("Arithmetic exception Trying to divide by 0");
            } catch (NumberFormatException ae) {
                System.out.println("Invalid input!! Entered number must be integer");
            }

            System.out.println("Continue: 1\nExit: 0");
            int n = sc.nextInt();
            if(n==0){
                flag = false;
            }else{
                flag = true;
            }
        }
    }
}
