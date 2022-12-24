package Assignment10;

public class Sedan extends Car{
    public Sedan() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building SEDAN car");
    }

}
