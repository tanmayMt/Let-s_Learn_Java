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
class Thread1
{
    public static void main(String []args)
    {
                               //  Same
        A obj1 = new A();  // Thread obj1 = new A();
        B obj2 = new B();  // Thread obj2 = new B();
        C obj3 = new C();  // Thread obj3  = new C();
        obj1.start();
        obj2.start();
        obj3.start();
        System.out.println("Exit From Main Thread");
    }
}