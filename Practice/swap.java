package Practice;

import java.util.Scanner;

public class swap {
    int a,b;
    swap(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void Swap(){
        int temp;
        temp = this.a;
        this.a = this.b;
        this.b = temp;
    }
    public void display(){
        System.out.println("A: "+this.a);
        System.out.println("B: "+this.b);
    }

    public static void main(String[] args) {
        swap sw = new swap(2,5);
        System.out.println("Before swap");
        sw.display();
        System.out.println("After swap");
        sw.Swap();
        sw.display();
    }
}
