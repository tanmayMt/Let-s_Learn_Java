import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteTextFile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        String in ;
        try{
            fw=new FileWriter("write.txt");

            //Input
            System.out.println("Enter text need to be written to the file: ");
            in = sc.nextLine();


            fw.write(in);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            try 
            {
                fw.close();
            } 
            catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
