//when Final Variable is a reference
package Problem;
class B
{

}
class A
{
    int age;
    A(int age)
    {
        this.age=age;
    }
    void display()
    {
        System.out.println("Age: "+this.age);
    }
}
class FinalKeyword3
{
    public static void  main(String [] args)
    {
        final B obj = new B();
        
        B obj1 = new B();
        System.out.println((obj1));

    }
}