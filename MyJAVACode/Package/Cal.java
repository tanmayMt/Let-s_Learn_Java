//Create package and add class in that                Location:  F:\Prog\Cal.java
package mypk1;
class Add
{
    void operation(int a, int b)
    {
        int c;
        c=a+b;
        System.out.println("a+b = "+c);
    }
}
class Sub
{
    void operation(int a, int b)
    {
        int c;
        c=a-b;
        System.out.println("a-b = "+c);
    }
}

public class Cal
{
    public static void main(String[] args) 
    {
        Add obj1 = new Add();
        Sub obj2 = new Sub();
        obj1.operation(10,5);
        obj2.operation(10,5);
    }
}
