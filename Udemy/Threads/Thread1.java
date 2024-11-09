import static java.lang.System.out;
import java.lang.Thread;
class A extends Thread
{
    @Override
    public void run()
    {
        out.println("Start of Thraed A");
        out.println("End of Thraed A\n");
    }
}
class Thread1
{
    public static void main(String[] args) 
    {
        out.println("Start of Main Thread");
        Thread t1 = new A(); 
        t1.start();
         // t1.start(); //Error:  java.lang.IllegalThreadStateException
        
        
        Thread t2 = new A(); 
        t2.start();         
        
        out.println("End of Main Thread");
    }
}
