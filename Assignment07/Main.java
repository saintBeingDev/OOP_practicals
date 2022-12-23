package Assignment07;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean isPrime(int num){
        int flag = 0;
        for(int i = 2; i<=num/2; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0)return true;
        return false;
    }
    public static <T> void count(String type, ArrayList<T> element){
        int even = 0, odd =0, prime = 0, palin =0;
        if(type.equals("even")){
            for(T value: element){
                if (Integer.parseInt(value.toString()) % 2 == 0)
                    even ++;
            }
            System.out.println("Total even elements: "+ even);
        }
        if(type.equals("odd")){
            for(T value: element){
                if (Integer.parseInt(value.toString()) % 2 != 0)
                    odd ++;
            }
            System.out.println("Total odd elements: "+ odd);
        }

        //For prime number count
        if(type.equals("prime")){
            for(T value:element){
                if(isPrime(Integer.parseInt(value.toString())))
                    prime++;
            }
            System.out.println("Total prime numbers: "+ prime);
        }

        //For palindrome string
        if(type.equals("palindrome")){
            for(T value: element){
                StringBuffer rev = new StringBuffer(value.toString());
                //StringBuffer class has method reverse so we are using
                if(value.toString().equals(new String(rev.reverse()))){
                    palin++;
                }
            }
            System.out.println("Total palindrome string : "+palin);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc_str = new Scanner(System.in);
//        Integer[] iarray = {45, 7, 12 ,32 ,89, 90};
//        //generic function count
////        count("even", iarray);
//
//        Byte[] barray = {45, 7, 12 ,32 ,89,3, 90, 10};
//        Short sarray[] = {45, 7, 12 ,32 ,89, 90};
//        Long larray[] = {45L, 7L, 12L ,32L ,89L, 90L};
//        String[] str = {"om","abcba","soos","abc", "level"};
//        // can work same for byte, short, and long array
//        count("even", barray);
//        count("odd", barray);
//        count("prime", barray);
//        count("palindrome", str);

        int choice;
        System.out.println("--------------------------");
        System.out.println("Create an array of Integer");
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter number of array elements: ");
        int n = sc.nextInt();
        System.out.println("Enter element one by one: ");
        for(int i = 0; i<n; i++){
            int ch = sc.nextInt();
            arr.add(ch);
        }
        System.out.println("--------------------------");
        ArrayList<String> str_arr = new ArrayList<>();
        System.out.println("Create an array of Strings with palindrome");
        System.out.print("\nEnter number of elements in array");
        int sn = sc.nextInt();
        for(int i = 0; i<sn; i++){
            String s = sc_str.next();
            str_arr.add(s);
        }
        System.out.println("--------------------------");
        do{



            System.out.println("""
                    1.Count even numbers
                    2.Count odd numbers
                    3.Count prime numbers
                    4.Count palindrome strings
                    0. Exit""");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1->{
                    count("even", arr);
                }case 2->{
                    count("odd",arr );
                }case 3->{
                    count("prime", arr);
                }case 4->{
                    count("palindrome", str_arr);
                }case 0->{
                    System.out.println("Thanks for using our services! Exiting program...");
                }default -> {
                    System.out.println("Enter valid choice");
                }
            }
        }while(choice!=0);
    }
}
