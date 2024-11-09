import static threadColorpk.ThreadColor.*;
import static java.lang.System.out;
import java.lang.Thread;
class B extends Thread
{
    @Override
    public void run()
    {
        out.println(ANSI_BLUE +"Start of Thraed B");
        out.println(ANSI_BLUE + "End of Thraed B\n");
    }
}
class A extends Thread
{
    @Override
    public void run()
    {
        out.println(ANSI_PURPLE+"Start of Thraed A");
        try
        {   
            out.println(ANSI_PURPLE+"A: 'I am going to sleep for 3 sec!!!!!!!'");
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            out.println(ANSI_PURPLE+"A: '3 sec over I am woke up^^^^^'");
            // return;
        }
        out.println(ANSI_PURPLE+"End of Thraed A\n");
    }
}
class Thread2
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
