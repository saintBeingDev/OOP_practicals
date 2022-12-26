package Assignment02_b;

import java.util.Scanner;

class publication
{

    String title;
    int price;
    int copies;

    int salecopy()
    {
        System.out.println("Total sale of the publication is: " + (price * copies));
        return  (price * copies);
    }
}

class books extends publication
{
    String author;

    Scanner sc = new Scanner(System.in);

    void ordercopies()
    {
        System.out.println("Enter the title of the book: ");
        title = sc.next();
        System.out.println("Enter the author of the book: ");
        author = sc.next();
        System.out.println("Enter the price of the book: ");
        price = sc.nextInt();
        System.out.println("Enter the number of the copies to order: ");
        copies = sc.nextInt();
    }

    void display()
    {
        System.out.println("\nBook Details: ");
        System.out.println("Name of the Book : " + title);
        System.out.println("Author of the Book : " + author);
        System.out.println("Price of the Book : " + price);
        System.out.println("Number of copies ordered : " + copies);
        System.out.println("-------------------------------");
    }

    @Override
    int salecopy()
    {
        return  price*copies;
    }

}

class Magazine extends  publication
{
    int currissue;
    Scanner sc = new Scanner(System.in);

    void receiveissue()
    {
        System.out.println("\n\nEnter the title of the Magazine: ");
        title = sc.next();
        System.out.println("Enter the current issue number of the magazine: ");
        currissue = sc.nextInt();
        System.out.println("Enter the price of the magazine: ");
        price = sc.nextInt();
        System.out.println("Enter the number of the copies to order: ");
        copies = sc.nextInt();
    }

    void display()
    {
        System.out.println("\nMagazine Details: ");
        System.out.println("Name of the magazine : " + title);
        System.out.println("Current Issue Number of the magazine : " + currissue);
        System.out.println("Price of the magazine : " + price);
        System.out.println("Number of copies ordered : " + copies);
        System.out.println("-------------------------------");
    }

    @Override
    int salecopy()
    {
        return  price*copies;
    }

}
public class Main {

    public static void main(String[]args)
    {

        books b1 = new books();
        b1.ordercopies();
        b1.display();
        System.out.println("Total sale of the Book Section is: " + b1.salecopy());

        Magazine m1 = new Magazine();
        m1.receiveissue();
        m1.display();
        System.out.println("Total sale of the magazine Section is: " + m1.salecopy());

        System.out.println("\n\nTotal sale of the Publication is: " + (b1.salecopy() + m1.salecopy()));


    }
}