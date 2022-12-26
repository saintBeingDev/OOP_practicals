package Practice.Assign10;

public class Client {
    public static void main(String[] args) {
        Car c = null;

        c = CarFactory.bulidCar(CarType.SEDAN);
        c.construct();

        c = CarFactory.bulidCar(CarType.SUV);
        c.construct();
    }
}
