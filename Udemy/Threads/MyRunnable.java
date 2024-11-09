//Udemy 324
import static java.lang.System.out;
import java.lang.Thread;
import java.lang.Runnable;

public class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        out.println("Hello from MyRUnnable1's i mplementation of run()");

    }
}

class  MyRunnable1
{
    public static void main(String[] args) 
    {
        out.println("Hello from main()");
        // MyRunnable myrun = new MyRunnable();
        Thread t = new Thread(new MyRunnable());
        t.start();
        out.println("Hello from main() again");
    }
}
