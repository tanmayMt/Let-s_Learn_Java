//Random aceess the contains of a file
import java.io.*;
public class RandomAccessFileTest {
    public static void main(String[] args)
    {
        RandomAccessFile raf = null;
        int i;
        try
        {
            raf = new RandomAccessFile("myFile1.txt","rw");
            for (int a=0;a<=raf.length();a+=2)
            {
                raf.seek(a);
                i=raf.read();
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
                raf.close();
            }
            catch(IOException e)
            {
                System.err.println(e.getStackTrace());
            }
        }

    }
}