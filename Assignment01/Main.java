package Assignment01;

import java.util.Scanner;

class Complex{
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        return(temp);
    }
    public Complex sub(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real - n2.real;
        temp.imag = n1.imag - n2.imag;
        return(temp);
    }
    public Complex mul(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real * n2.real;
        temp.imag = n1.imag * n2.imag;
        return(temp);
    }
    public Complex div(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real / n2.real;
        temp.imag = n1.imag / n2.imag;
        return(temp);
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex n1=new Complex(0.0, 0.0),
                n2=new Complex(0.0, 0.0),
                temp=new Complex(0.0, 0.0);
        System.out.print("Enter the real part of First Complex No. (C1): ");
        n1.real = sc.nextDouble();
        System.out.print("Enter the imaginary part of First Complex No. (C1): " );
        n1.imag = sc.nextDouble();
        System.out.print("Enter the real part of First Complex No. (C2): ");
        n2.real = sc.nextDouble();
        System.out.print("Enter the imaginary part of First Complex No. (C2): " );
        n2.imag = sc.nextDouble();
        System.out.println("-----------Entered numbers are----------");
        System.out.println(n1.real+"r " + n1.imag+"i");
        System.out.println(n2.real+"r " + n2.imag+"i");
        System.out.println("----------------------------------------");

        boolean flag = true;
        while(flag){
            System.out.println("""
                    1.Addition
                    2.Subtraction
                    3.Multiplication
                    4.Division
                    5.Exit
                    """);
            int n = sc.nextInt();
            switch (n){
                case 1->{
                    Complex ans = temp.add(n1,n2);
                    System.out.println("Addition is: ");
                    System.out.println(ans.real+"r "+ans.imag+"i");
                    System.out.println("==========================");
                }case 2->{
                    Complex ans = temp.sub(n1,n2);
                    System.out.println("Subtraction is: ");
                    System.out.println(ans.real+"r "+ans.imag+"i");
                    System.out.println("==========================");
                }case 3->{
                    Complex ans = temp.mul(n1,n2);
                    System.out.println("Multiplication is: ");
                    System.out.println(ans.real+"r "+ans.imag+"i");
                    System.out.println("==========================");
                }case 4->{
                    Complex ans = temp.div(n1,n2);
                    System.out.println("Division is: ");
                    System.out.println(ans.real+"r "+ans.imag+"i");
                    System.out.println("==========================");
                }
                case 5->{
                    flag = false;
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
