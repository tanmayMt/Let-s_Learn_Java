//Final Class 
final class A
{
    int a=8;
}
class B extends A
{
    int b=16;
    void display()
    {
        System.out.println("a="+a+"\n"+"b="+b);
    }
    
}
class FinalKeyword8 
{
    public static void  main(String [] args)
    {
        B obj = new B();
        obj.display();
    }
}
