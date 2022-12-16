package UT01_regular;

import java.util.Scanner;

class box{
    private int width, height, depth;
    Scanner sc = new Scanner(System.in);

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }


    public void getDimensions(){
        setWidth(10);
        setHeight(20);
        setDepth(5);
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
