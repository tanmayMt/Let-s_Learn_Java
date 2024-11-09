//325: Interrupt and Join

import static java.lang.System.out;
import java.lang.Thread;

class A extends Thread
{
    @Override
    public void run()
    {
        out.println("Start of Thraed A");
        try
        {
            out.println("A: 'I am going to sleep for 3 sec!!!!!!!'");
            Thread.sleep(8000);
        }
        catch(InterruptedException e)
        {
            out.println("A: '3 sec over I am woke up^^^^^'");
            return;
        }
        out.println("End of Thraed A\n");
    }
}

class Thread3
{
    public static void main(String[] args) 
    {
        out.println("Start of Main Thread");
        Thread t1 = new A();

        Thread t2 = new Thread()
        {
            t1.
        };
        out.println("End of Main Thread");
    }
}
