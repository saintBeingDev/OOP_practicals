package Practice.Assign10;

public class CarFactory {
    public static Car bulidCar(CarType model){
        Car car = null;

        switch (model){
            case SEDAN -> {
                car = new Sedan();
            }
            case SUV ->{
                car = new SUV();
            }
            default -> {
                System.out.println("Enter valid choice");
            }
        }

        return car;
    }
}
