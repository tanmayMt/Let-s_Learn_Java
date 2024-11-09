import java.io.*;

public class CheckedExceptionHandledDurgaSir3 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello");
    }
}
