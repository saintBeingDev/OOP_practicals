package Practice;

class Human{
    public static void walk(){
        System.out.println("Human walking");
    }
}
class Boy extends Human{
    public static void walk(){
        System.out.println("Boy walking");
    }
}
public class StaticBinding {
    public static void main(String[] args) {
        /* Reference is of Human type and object is
         * Boy type
         */
        Human obj = new Boy();
        obj.walk();

        /* Reference is of HUman type and object is
         * of Human type.
         */
        Human obj2 = new Human();
        obj2.walk();

    }
}
