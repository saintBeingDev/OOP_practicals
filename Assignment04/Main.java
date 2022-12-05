package Assignment04;

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
