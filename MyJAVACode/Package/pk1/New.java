package pk1;
import Ex2.animal1.Cat;
import dog_pk.Dog;
// import animal2.Donkey;
class A
{
    void show()
    {
        System.out.println("show() of A");
    }
}
class B
{
    void show()
    {
        System.out.println("show() of B");
    }
}
public class New
{
    public static void main(String[] args)
    {
        System.out.println("Package Name: pk1");
        A o1 =new A();
        B o2 =new B();
        Dog d = new Dog();
        d.show();
        // Donkey d3 = new Donkey();
        // d3.donkey_name();
        o1.show();
        o2.show();
    }
}
