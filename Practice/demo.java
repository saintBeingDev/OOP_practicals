package Practice;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do{

            System.out.println("Do you want to continue: [y/n]");
            char c = sc.next().charAt(0);
            if(c == 'n' || c == 'N')flag = false;
        }while(flag);
    }
}
