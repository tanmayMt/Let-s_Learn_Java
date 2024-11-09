import java.io.File;
//Create Directory
class MakeDirectory
{
    public static void main(String[] args)
    {
        File dir = new File("MyDir");
        // File dir = new File("C:/Users/MyDir");
        dir.mkdir();
        // dir.delete();
        String abs_path=dir.getAbsolutePath();
        String name = dir.getName();
        System.out.println("abs_path: "+abs_path);
        System.out.println("name: "+name);
    }
}