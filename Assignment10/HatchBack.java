package Assignment10;

public class HatchBack extends Car{
    public HatchBack() {
        super(CarType.HATCHBACK);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building HATCHBACK car.");
        // add accessories
    }
}
