package Practice.Assign10;

public class SUV extends Car{
    SUV(){
        super(CarType.SUV);
    }

    @Override
    protected void construct() {
        System.out.printf("\nBuilding car: %s", super.getModel());
    }
}
