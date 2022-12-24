package Assignment10;

public class SUV extends Car{
    public SUV() {
        super(CarType.SUV);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building SUV...");
        // add accessories

    }
}
