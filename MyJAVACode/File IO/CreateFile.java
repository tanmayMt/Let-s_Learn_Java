
import java.io.*;
class CreateFile
{
    public static void main(String[] args) 
    {
        try
        {
            File file = new File("myFile.txt");
            if (file.createNewFile())
               System.out.println(file.getName()+ " is created");
            else
               System.out.println("File is already exists");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}
