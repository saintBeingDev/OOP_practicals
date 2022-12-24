package FactoryDesignPattern;

// for factory design pattern we are using approach
// Code for interface not for implementation
// Use interface as reference type and change implementation whenever you want
public class Client {
    public static void main(String[] args) {
        // client wants to get triangle
        // client dont know the implementation
        // so use interface as reference
        Polygon triangle = PolygonFactory.getInstance(3);
        System.out.println(triangle.getType());

        // square
        Polygon square = PolygonFactory.getInstance(4);
        System.out.println(square.getType());

        // Pentagon
        Polygon pentagon = PolygonFactory.getInstance(5);
        System.out.println(pentagon.getType());
    }
}
