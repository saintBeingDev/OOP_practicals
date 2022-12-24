package FactoryDesignPattern;

public class PolygonFactory {
    public static Polygon getInstance(int sides){
        // sides 3 ->triangle
        // sides 4 -> square
        //sides 5 -> pentagon returned
        Polygon polygon = null;
        switch (sides){
            case 3->{
                polygon = new Triangle();
            }
            case 4->{
                polygon = new Square();
            }
            case 5->{
                polygon = new Pentagon();
            }
            default -> {
                System.out.println("Enter valid number of sides");
            }
        }
        return polygon;
    }
}
