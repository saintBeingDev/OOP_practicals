package File_handling;

import java.io.PrintWriter;

public class Java_PrintWriter {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("This is string");
        int i = -7;
        double d = 4.5e-7;
        pw.println(i);
        pw.println(d);
    }
}
