//Priority
import java.lang.Thread;
class A extends Thread
{
    @Override
    public void run()
    {
        for (int i=0;i<6;i++)
            System.out.println("From Thread A: "+i);
        System.out.println("Exit from Thread A");
    }
}
class B extends Thread
{
    @Override
    public void run()
    {
        for (int i=0;i<6;i++)
            System.out.println("From Thread B: "+i);
        System.out.println("Exit from Thread B");
    }
}
class C extends Thread
{
    @Override
    public void run()
    {
        for (int i=0;i<6;i++)
            System.out.println("From Thread C: "+i);
        System.out.println("Exit from Thread C");
    }
}
class Thread3
{
    public static void main(String []args)
    {
        A a = new A();
        B b = new B();
        C c = new C();

        a.setPriority(Thread.NORM_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        c.setPriority(Thread.MAX_PRIORITY);

        System.out.println("a: "+a.getPriority());
        System.out.println("b: "+b.getPriority());
        System.out.println("c: "+c.getPriority());

        a.start();
        b.start();
        c.start();
        System.out.println("Exit From Main Thread");
    }
}