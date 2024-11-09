//MAKAUT 2014-15
//Write a program in that create a child Thread of main using 
//Runnable interface and uss the following methods:
// 1)getName 2)setName() 3)setPriority()

class A implements Runnable
{
    public void run()
    {
        for(int a=0;a<5;a++)
            System.out.println("From Thread A: a="+a);
        System.out.println("End of Thread A");
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int b=0;b<5;b++)
            System.out.println("From Thread B : b="+b);
        System.out.println("End of Thread B");
    }
}

public class Thread6 {
    public static void main(String[] args) 
    {
        A ob1 = new A();
        B ob2 = new B();

        Thread t1 = new  Thread(ob1);
        Thread t2 = new  Thread(ob2);

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setName("A");
        System.out.println("After t1.setName(\"A\"): "+t1.getName());

        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
