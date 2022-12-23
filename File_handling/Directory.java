package File_handling;

import java.io.File;

public class Directory {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        String dirname = "C:\\Users\\mansi\\OneDrive\\Desktop\\Test_java";
        File f2 = new File(dirname);

        if(f2.isDirectory()){
            System.out.println("Directory of  "+ dirname);
            String s[] = f2.list();
            for(int i =0; i<s.length; i++){
                System.out.println(s[i]);
            }
        }else{
            System.out.println(dirname+" is not a directory");
        }
    }
}
