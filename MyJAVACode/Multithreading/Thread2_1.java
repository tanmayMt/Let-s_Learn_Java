import static java.lang.System.out;
import java.lang.Thread;
class B extends Thread
{
    @Override
    public void run()
    {
        out.println("Start of Thraed B");
        out.println("End of Thraed B\n");
    }
}
class A extends Thread
{
    @Override
    public void run()
    {
        out.println("Start of Thraed A");
        try
        {
            Thread.sleep(3000);
            out.println("A: 'I am going to sleep for 3 sec!!!!!!!'");
        }
        catch(InterruptedException e)
        {
            out.println("A: '3 sec over I am woke up^^^^^'");//Why this statement is not executing?
        }
        out.println("End of Thraed A\n");
    }
}
class Thread2_1
{
    public static void main(String[] args) 
    {
        out.println("Start of Main Thread");
        Thread t1 = new A(); 
        Thread t2 = new B(); 
        t1.start();
        t2.start();
         // t1.start(); //Error:  java.lang.IllegalThreadStateException   
        
        out.println("End of Main Thread");
    }
}
