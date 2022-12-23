package File_handling;

import java.io.File;

public class File_class {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File("D:\\SY_1sem\\Programs\\OOP prs\\File_handling\\test.txt");
        p("File name "+f1.getName());
        p("File path "+f1.getPath());
        p("Abs path "+f1.getAbsolutePath());
        p("Parent "+f1.getParent());
        p(f1.exists() ? "Exists":"does not exists");
        p(f1.canWrite()? "is writable":"is not writable");
        p(f1.canRead() ? "is readable": "is not readable");
        p(f1.isDirectory()? " is directory": "is not a directory");
        p(f1.isFile() ? "is normal file":"might be a named pipe");
        p(f1.isAbsolute() ? "is absolute": "is not absolute");
        p("File size: "+f1.length()+" bytes");

    }
}
