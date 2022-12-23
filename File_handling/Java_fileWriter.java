package File_handling;

import java.io.*;

class stud implements Serializable{
    private String name;
    private int roll;
    stud(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}
public class Java_fileWriter {
    public static void main(String[] args) {
        String src = """
                this is string i want to write to file
                author is Om Nikam
                second year 23391
                """;
        FileWriter fw=null;
        try{
            fw = new FileWriter("File_handling/data.txt");
            fw.write(src);
        }catch(IOException E){
            System.out.println(E);
        }
        finally {
            try{
                fw.close();
            }catch (IOException e ){
                System.out.println(e);
            }
        }
    }
}
