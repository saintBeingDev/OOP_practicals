package File_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.println("""
                1.Read character
                2.Read string
                3. exit""");
            int n = sc.nextInt();
            switch (n){
                case 1->{
                    System.out.println("----------------Reading chracters-----------------");
                    System.out.println("Enter characters, 'q' to quit");
                    char c;
                    do {
                        c= (char) br.read();
                        System.out.println(c);
                    }while(c!='q');
                }
                case 2->{
                    String str;
                    System.out.println("""
                        Enter lines of text:
                        Enter 'stop' for quit""");
                    do{
                        str = br.readLine();
                        System.out.println(str);
                    }while(!str.equals("stop"));
                }
                case 3->{
                    flag = false;
                }
                default -> {
                    System.out.println("Enter valid choice");
                }
            }
        }





    }
}
