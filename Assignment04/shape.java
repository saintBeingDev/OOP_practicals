package Assignment04;
import java.util.Scanner;

abstract class shape {
    double l,b,area;
    void setDimension()
    {
        System.out.println("Enter the length: ");
        Scanner s = new Scanner(System.in);
        double length = s.nextDouble();
        System.out.println("Enter the height: ");
        double height = s.nextDouble();
        this.l = length;
        this.b = height;
    }
    abstract void compute_area();

}
