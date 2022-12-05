package Assignment05;
import java.util.Scanner;
/*
Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way

 */
public class Main {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        while(flag != -1){
            System.out.println("Enter 1 for Bicycle");
            System.out.println("Enter 2 for Car");
            System.out.println("Enter 3 for Bike");
            int choice;
            choice = sc.nextInt();
            switch(choice){
                case 1 ->{
                    Bicycle bicycle1 = new Bicycle();
                    bicycle1.gearChange(2);
                    bicycle1.speedUp(10);
                    bicycle1.applyBreak(5);
                    bicycle1.display();
                }
                case 2 ->{
                    Car car1 = new Car();
                    car1.display();
                    car1.gearChange(3);
                    car1.speedUp(20);
                    car1.applyBreak(10);
                }
                case 3 ->{
                    Bike bike1 = new Bike() ;
                    bike1.display();
                    bike1.gearChange(3);
                    bike1.speedUp(20);
                    bike1.applyBreak(10);
                }
            }
            System.out.println("Press -1 to Exit and press any other number to continue");
            flag = sc.nextInt();
        }
    }
}
