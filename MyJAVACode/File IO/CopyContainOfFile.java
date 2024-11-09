import java.io.*;
class CopyContainOfFile
{
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        FileOutputStream fos =null;
        byte b;
        try
        {
            fis = new FileInputStream("myFile1.txt");
            fos = new FileOutputStream("myFileD.txt");

            while ((b=(byte)fis.read()) != -1)
            {
                fos.write(b);
            }
        }
        catch(IOException e)
        {
            System.err.println(e.getStackTrace());
        }
        finally
        {
            try
            {
                fis.close();
                fos.close();
            }
            catch(IOException e)
            {
            }
        }
    }
}