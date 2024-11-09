//Read Character from File
import java.io.*;
public class ReadCharFromFile
{
    public static void main(String[] args)
    {
        FileReader fr=null;
        String s; //String a sequence of characters  char [] ch
        int i;
        try
        {
            fr = new FileReader("myFile1.txt");
            while ((i=fr.read()) != -1)
            {
                System.out.print((char)i);
            }
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
        finally
        {
            try
            {
                fr.close();
            }
            catch(IOException e)
            {
                System.err.println(e);
            }
        }
    }
}
