package Practice.Assign10;

public class Sedan extends Car{
    Sedan() {
        super(CarType.SEDAN);
    }

    @Override
    protected void construct() {
        System.out.printf("Building car: %s", super.getModel());
    }
}
