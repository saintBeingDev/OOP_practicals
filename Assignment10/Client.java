package Assignment10;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = null;

        System.out.println("---------------------------------------------------");
        System.out.println("Welcome to OM'S CARS STORE ");
        System.out.println("---------------------------------------------------");

        int flag = 1;
        do{
            System.out.println("""
                    1.SEDAN
                    2.HATCHBACK
                    3.SUV""");
            System.out.print("Which car do you want to order? ");
            int ch = sc.nextInt();
            switch (ch){
                case 1->{
                    car = CarFactory.buildCar(CarType.SEDAN);
                }
                case 2->{
                    car = CarFactory.buildCar(CarType.HATCHBACK);
                }
                case 3->{
                    car = CarFactory.buildCar(CarType.SUV);
                }
            }
            System.out.println("Do you want to order another car? [y/n]");
            char c = sc.next().charAt(0);
            if(c == 'n' || c == 'N')flag = 0;
        }while(flag != 0);
    }
}
