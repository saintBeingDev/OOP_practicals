package UT01_regular;

import java.util.Scanner;

class box{
    private int width, height, depth;
    Scanner sc = new Scanner(System.in);
    public void getDimensions(){
        System.out.println("Enter Width:");
        this.width = sc.nextInt();
        System.out.println("Enter height:");
        this.height = sc.nextInt();
        System.out.println("Enter depth:");
        this.depth = sc.nextInt();
    }
    public int calculateVolume(){
        return (this.depth*this.width*this.height);
    }
}

public class ut01_2b {
    public static void main(String[] args) {
        box b1 = new box();
        b1.getDimensions();
        System.out.println("Volume of give box is: "+b1.calculateVolume());
    }
}
