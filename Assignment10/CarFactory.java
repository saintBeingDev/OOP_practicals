package Assignment10;

public class CarFactory {
    // this factory will return the object of car type
    public static Car buildCar(CarType model){

        Car car = null;
        switch (model){
            case HATCHBACK -> {
                car = new HatchBack();
            }
            case SUV -> {
                car = new SUV();
            }
            case SEDAN -> {
                car = new Sedan();
            }
        }
    return car;
    }
}
