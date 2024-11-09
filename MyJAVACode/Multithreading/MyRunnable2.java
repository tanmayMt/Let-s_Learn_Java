class MyRun extends Thread
{
    public void run()
    {
        System.out.println("fun() of MyRunnable class: "+currentThread().getName());
    }
}
public class MyRunnable2 
{
    public static void main(String[] args) 
    {
        MyRun o = new MyRun();
        o.setName("A");

        o.run();    //main
        o.start();  //A
    }
}
