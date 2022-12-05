package Assignment05;
/*
Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way

 */
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle();
        bicycle1.gearChange(2);
        bicycle1.speedUp(10);
        bicycle1.applyBreak(5);
        bicycle1.display();

        System.out.println("-----------------------------------------");
        Car car1 = new Car();
        car1.display();
        car1.gearChange(3);
        car1.speedUp(20);
        car1.applyBreak(10);

        System.out.println("-----------------------------------------");
        Bike bike1 = new Bike() ;
        bike1.display();
        bike1.gearChange(3);
        bike1.speedUp(20);
        bike1.applyBreak(10);
    }
}
