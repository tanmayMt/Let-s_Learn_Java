//Read Character from File
import java.io.*;
class ReadByteFromFile
{
    public static void main(String[] args) //throws IOException
    {
        FileInputStream infile = null;
        int i;
        try
        {
            // File f = new File("myFile");
            infile = new FileInputStream("myFile1.txt");
            while ((i=infile.read()) != -1)
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
                infile.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
    }
}

