package Assignment02;

import java.util.Scanner;
class Publication {
    String title;
    int copies, price;
    void saleCopy() {

    }
}
class Book {
    String title;
    int copies, price;
    void saleCopy() {
        price = 250;
        System.out.println("Total sales for book: " + copies * price);
    }
    void orderCopies() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter copies of books: ");
        copies = in.nextInt();
    }
}
class Magazines {
    String title;
    int copies, price;
    void saleCopy() {
        price = 100;
        System.out.println("Total sales for magazines: " + copies * price);
    }
    void currentIssue() {

    }
    void recieveIssue(){

    }
}

public class Assign02
{
    public static void main(String[] args) {
        Book b = new Book();
        b.orderCopies();
        b.saleCopy();

        Magazines m = new Magazines();
        m.saleCopy();
    }
}