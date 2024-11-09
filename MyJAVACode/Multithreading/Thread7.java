import java.lang.Runnable;
class A implements Runnable
{
    public void run()
    {
        for(int a=1;a<=5;a++)
        {
            System.out.println("From Thread A : a = "+a);
        }
        System.out.println("End of Thread A");
    }

}


class Thread7
{
    public static void main(String[] args) {
        A o1 = new A();

        Thread t1 = new Thread(o1);

        t1.start();
        System.out.println("End of "+Thread.currentThread().getName());
    }
}