//Read Character data from text file 
import java.io.FileReader;
import java.io.IOException;
public class ReadTextFile1 {
    public static void main(String[] args) {
        FileReader fr=null;
        int i;
        try {
            fr = new FileReader("doc.txt");
            while ((i=fr.read())!=-1) 
                System.out.print((char)i);
            
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
        
            try {
                fr.close();
            } 
            catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
