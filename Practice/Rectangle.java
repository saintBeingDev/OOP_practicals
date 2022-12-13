package Practice;

public class Rectangle {
    double l,b,h;
    Rectangle(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public void surfaceArea(){
        double sarea= (2 * (l*b + b*h + l*h));
        System.out.println("Surface area: "+sarea);
    }
    public void volume(){
        double vol = l*b*h;
        System.out.println("Volume: "+vol);
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2,3,5);
        rc.surfaceArea();
        rc.volume();
    }
}
