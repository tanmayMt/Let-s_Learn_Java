import static java.lang.System.out;
import java.lang.Thread;
class A extends Thread
{
    
    public void run()
    {
        out.println("Thread A start");
        for(int i=1; i<=4; i++)
        {
            out.println("\tFrom A : i= "+i);
        }
        out.println("Thread A Exit");
    }
}

class B extends Thread
{
    
    public void run()
    {
        out.println("Thread B start");
        for(int j=1; j<=4; j++)
        {
            out.println("\tFrom B : j= "+j);
        }
        out.println("Thread B Exit");
    }
}
class ThraedPriority 
{
    public static void main(String[] args) 
    {
        Thread t1 = new A();
        Thread t2 = new B();
        t1.setPriority(1);
        t1.setPriority(Thread.MIN_PRIORITY);

        t2.setPriority(t1.getPriority()+1);  //2
        out.println(t2.getPriority());

        t2.setPriority(10);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(5);
        t2.setPriority(Thread.NORM_PRIORITY);

        out.println(t1.getPriority());
        out.println(t2.getPriority());
        

        t1.start();
        t2.start();
    }
}
