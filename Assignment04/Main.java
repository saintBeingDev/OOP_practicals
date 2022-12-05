package Assignment04;

/*
Design a base class shape with two double type values and member functions to input the data
and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make
compute_area() as abstract function and redefine this function in the derived class to suit their
requirements. Write a program that accepts dimensions of triangle/rectangle and display
calculated area. Implement dynamic binding for given case study
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int flag=0;
        Scanner get = new Scanner(System.in);
        while(flag !=-1)
        {
            System.out.println("Press 1 to calculate area of rectangle.");
            System.out.println("Press 2 to calculate area of triangle.");
            int x = get.nextInt();
            switch (x) {
                case 1 -> {
                    System.out.println("""
                            ===============
                            RECTANGLE AREA CALCULATOR
                            ===============""");
                    Rectangle r = new Rectangle();
                    r.setDimension();
                    r.compute_area();
                }
                case 2 -> {
                    System.out.println("""
                            ===============
                            TRIANGLE AREA CALCULATOR
                            ===============""");
                    Triangle t = new Triangle();
                    t.setDimension();
                    t.compute_area();
                }
                default -> System.out.println("Please enter a valid input.");
            }
            System.out.println("Press -1 to Exit and press any other number to continue");
            flag = get.nextInt();
        }

    }
}
