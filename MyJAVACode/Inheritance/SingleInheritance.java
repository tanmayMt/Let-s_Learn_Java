import static java.lang.System.out;
class Mom
{
    private double m1;
    protected double m2;

    Mom()
    {
        m1=100; //private
        m2=500; //protected
    }
    void displayMomMoney()
    {
        out.println("Mom Money : m2(protected) = "+m2);
    }
}
class Child extends Mom
{
    private double c1;
    Child()
    {
        super();
        c1=100;
    }
    void displayChildMoney()
    {
        displayMomMoney();
        c1=m2+c1;
        out.println("Child Total Money : c1 = "+c1);
    }
}
public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Child m = new Child();
        m.displayChildMoney();

        // Mom m = new Mom();
        // out.println(m);
    }
}
