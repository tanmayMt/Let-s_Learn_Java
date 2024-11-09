//Write byte to File
import java.io.*;
class WriteByteToFile
{
    public static void main(String[] args) //throws IOException
    {
        try
        {
            // File f = new File("myFile");
            FileOutputStream outfile = new FileOutputStream("myFile.txt");
            String s = "Name: Tanmay Samanta\nAge: 21";

            byte [] b = s.getBytes();
            // byte [] b = {65,66,67};
            //           A  B  C
            outfile.write(b);
            outfile.close();
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}

