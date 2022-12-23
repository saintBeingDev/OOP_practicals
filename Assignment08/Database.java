package Assignment08;

import java.util.Scanner;
import java.io.*;

public class Database {
    private int student_id;
    private int roll_no;
    private String division;
    private double marks;
    private String student_name;
    private String address;

    Scanner sc = new Scanner(System.in);
    Scanner scstr = new Scanner(System.in);

    File fl = null;
    FileWriter fw = null;

    Database() {
        createNewFile();
//        clearFile();
    }
    public void createNewFile() {
        fl =new File("Assignment08/data.txt");;
        if (!fl.exists()){
            System.out.println("\nFile Created Successfully!!!");
        } else {
            System.out.println("File Already Exists");
        }
    }

    public void clearFile() {
        File obj1 = new File("temp.txt");
        fl.delete();
        obj1.renameTo(fl);
    }

    public void takeInput(){
        System.out.print("Enter Student id: ");
        student_id = sc.nextInt();
        System.out.print("Enter student name: ");
        student_name = scstr.nextLine();
        System.out.print("Enter Division: ");
        division = scstr.nextLine();
        System.out.print("Enter student rollNo: ");
        roll_no = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextDouble();
        System.out.print("Enter address: ");
        address = scstr.nextLine();
    }
    public void addRecord() throws IOException {
        try{
            fw = new FileWriter("Assignment08/data.txt", true);
            int ch = -1;
            do{
                //take input from user for each student record
                takeInput();

                String str = student_name + "\t" + student_id + "\t" + roll_no + "\t" + address + "\t" + division + "\t" + marks + "\n";

                if(fl.length()==0) {
                    fw.write("Name\t\tId\t\tRollNo\t\tAddress\t\tClass\t\tMarks\n");
                    fw.write(str);
                }
                else
                {
                    fw.write(str);
                }


                System.out.println("Do you want to insert one more record?[y/n]");
                char c = sc.next().charAt(0);
                if(c == 'n'|| c=='N'){
                    ch = 0;
                }
            }while(ch!=0);
        }catch(IOException e){
            System.out.println(e);
        }
        finally {
            try{
                fw.close();
            }catch (IOException e ){
                System.out.println("Exception while closing file"+e);
            }
        }


    }

    public void readRecords() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("Assignment08/data.txt"));){
            String str ;
            while((str = br.readLine())!=null){
                System.out.println(str);
            }
        }catch (IOException e){
            System.out.println("Exception while reading "+ e);
        }
    }

    public void searchRecord() throws IOException{
        fl = new File("Assignment08/data.txt");
        if(fl.exists()){
            try(BufferedReader br = new BufferedReader(new FileReader("Assignment08/data.txt"));){
                System.out.print("Enter student ID of student to be searched:");
                int id = sc.nextInt();
                // convert int id to string id
                String str_id = Integer.toString(id);
                String str;
                boolean found = false;
                System.out.println("-------------------------");
                while((str = br.readLine())!=null){
                    String[] arr = str.split("\t");
                    if(str_id.equals(arr[1])){
                        System.out.println(str);
                        found =true;
                        break;
                    }
                }
                String ans = found ? "Record found!" : "Record doesn't exist in database.";
                System.out.println(ans);
                System.out.println("-------------------------");
            }
            catch (IOException e){
                System.out.println("Exception while searching" + e);
            }
        }else{
            System.out.println("File does not exists");
        }
    }

    public void deleteRecord() throws IOException{
//        You should create a temporary file in which you write the data. After that, you can delete the original file, then rename the temporary file to the original.
        fl = new File("Assignment08/data.txt");
        File tempFile = new File("Assignment08/temp.txt");

        if(fl.exists()){
            try(
                BufferedReader br = new BufferedReader(new FileReader(fl));
                FileWriter tempFileWriter = new FileWriter(tempFile);
                )
            {
                System.out.print("Enter student ID of student to be deleted:");
                int id = sc.nextInt();
                // convert int id to string id
                String str_id = Integer.toString(id);
                String str;
                boolean found = false;
                System.out.println("-------------------------");
                while((str = br.readLine())!=null){
                    String[] arr = str.split("\t");
                    // write all the records except the one we want to delete to our temp file

                    if(!str_id.equals(arr[1])){
                        tempFileWriter.write(str+"\n");
                    }else{
                        found = true;
                    }
                }
                String ans = found ? "Record deleted successfully" : "Record doesn't found";
                System.out.println(ans);
                System.out.println("---------------------------");

            }
            catch (IOException e){
                System.out.println("Exception while deleting" + e);
            }finally {
                try{
                    fl.delete();
                    tempFile.renameTo(fl);
                }catch (Exception e){
                    System.out.println("Error while renaming file "+ e);
                }
            }
        }else{
            System.out.println("File does not exists");
        }
    }

    public void updateRecord() throws IOException{
    // You should create a temporary file in which you write the data. After that, you can delete the original file, then rename the temporary file to the original.
        fl = new File("Assignment08/data.txt");
        File tempFile = new File("Assignment08/temp.txt");

        if(fl.exists()){
            try(
                BufferedReader br = new BufferedReader(new FileReader(fl));
                FileWriter tempFileWriter = new FileWriter(tempFile);
                )
            {
                System.out.print("Enter ID of student to be updated:");
                int id = sc.nextInt();
                // convert int id to string id
                String str_id = Integer.toString(id);
                String str;
                boolean found = false;
                System.out.println("-------------------------");
                while((str = br.readLine())!=null){
                    String[] arr = str.split("\t");
                    // write all the records except the one we want to delete to our temp file

                    if(!str_id.equals(arr[1])){
                        tempFileWriter.write(str+"\n");
                    }else{
                        found = true;
                        System.out.println("Enter modified data: ");
                        takeInput();
                        String newEntry = student_name + "\t" + student_id + "\t" + roll_no + "\t" + address + "\t" + division + "\t" + marks + "\n";
                        tempFileWriter.write("\n"+newEntry);
                    }
                }
                String ans = found ? "Record updated successfully" : "Record doesn't found";
                System.out.println(ans);
                System.out.println("---------------------------");

            }
            catch (IOException e){
                System.out.println("Exception while deleting" + e);
            }finally {
                try{
                    fl.delete();
                    tempFile.renameTo(fl);
                }catch (Exception e){
                    System.out.println("Error while renaming file "+ e);
                }
            }
        }else{
            System.out.println("File does not exists");
        }
    }

}
