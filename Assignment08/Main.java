package Assignment08;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int choice = -1;
        Scanner sc= new Scanner(System.in);
        Database db = new Database();
        do{
            System.out.println("""
                    ============Menu=================
                    1.Insert
                    2.Display
                    3.Search
                    4.Delete
                    5.Update
                    0.Exit
                    """);
            choice = sc.nextInt();

            switch (choice){
                case 1->{
                    db.addRecord();
                }
                case 2->{
                    db.readRecords();
                }
                case 3->{
                    db.searchRecord();
                }
                case 4->{
                    db.deleteRecord();
                }
                case 5->{
                    db.updateRecord();
                }
                case 0->{
                    System.out.println("Exiting programming Thanks for using.....");
                }
                default->{
                    System.out.println("Enter valid choice");
                }
            }
        }while(choice!=0);
    }
}
