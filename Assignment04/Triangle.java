package Assignment04;

public class Triangle extends shape{
    void compute_area()
    {
        area = (l*b)/2;
        System.out.println("Area of triangle: "+this.area);
    }

}
