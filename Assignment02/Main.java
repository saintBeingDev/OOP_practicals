package Assignment02;

/*
Identify commonalities and differences between Publication, Book and Magazine classes. Title, Price, Copies are common instance variables and saleCopy is common method. The differences are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue, receiveissue().Write a program to find how many copies of the given books are ordered and display total sale of publication.
 */

class Publication{
    String title;
    int price, copies;

    void saleCopy(){
        // int salecopy
        // return price * copies;
    }
}

class Book extends Publication{
    // author
    // override int salecopy
    // int saleCopy(){
    // total sale of book section
}

public class Main {
    public static void main(String[] args) {

    }
}
