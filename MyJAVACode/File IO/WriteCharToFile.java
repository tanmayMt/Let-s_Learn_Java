//Write character to File
import java.io.*;
public class WriteCharToFile
{
    public static void main(String[] args)
    {
        FileWriter fw = null;
        // char ch;
        String s;
        try
        {
            fw = new FileWriter("myFile1.txt");
            s="NAME: Tanmay Roy\nRoll: 32";
            // ch = 'a';

            fw.write(s);
            // fw.write(ch);
        }
        catch(IOException e)
        {
            System.err.println(e.getStackTrace());
        }
        finally
        {
            try
            {
                fw.close();
            }
            catch(IOException e)
            {
                System.err.println(e);
            }
        }
    }
}
