import java.lang.Thread;
import static java.lang.System.out;
import static threadColorpk.ThreadColor.ANSI_BLUE;

class B extends Thread
{
    @Override
    public void run()
    {
        out.println("Hello from B Thread");
    }

}

class Main1
{
    public static void main(String [] args)
    {
        out.println("Hello from main Thread");

        Thread obj1=new B();
        obj1.start();

        new Thread()
        {
            public void run()
            {
                out.println("Hello from anonymous thread");
            }
        }.start();        

        out.println("Hello again from main Thread");
    }
}