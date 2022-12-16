package Assignment06;

public class ArrayOutofBound {
    public static void main(String[] args) {
        int[] a = {5, 10};
        int b = 0;
        try {
            int x = a[2]/b - a[1];
        }
        catch (ArithmeticException e){
            System.out.println("Division by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound!!");
        }
    }
}
