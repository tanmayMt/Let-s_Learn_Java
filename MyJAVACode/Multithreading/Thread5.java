//MAKAUT 2014-15 
//Write a multithreading program to generate the square root 
//of the first 30 natural number using runnable interface
import java.lang.Runnable;

import java.math.*;
class A implements Runnable
{
    public void run()
    {
        for (int i=1;i<=30;i++)
        {
            double sq;
            sq=Math.sqrt(i);
            System.out.println("Square Root of "+i+" is : "+sq);
        }
        System.out.println("End of Thread A");
    }
}
class Thread5 
{
    public static void main(String[] args) 
    {
        A obj1 =new A();
        // obj1.run();

        Thread t = new Thread(obj1);
        t.start();
        System.out.println("End of main Thread");
    }
}
