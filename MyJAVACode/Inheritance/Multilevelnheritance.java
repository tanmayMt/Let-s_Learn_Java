class GandFather
{
    protected double g;
    
    GandFather()
    {
        g=500;
    }
}

class Father extends GandFather
{
    protected double f;
    Father()
    {
        super();
        f=200;
        f=g+f;
    }
}
class Child extends Father
{
    private double c;
    Child()
    {
        super();
        c=50;
        c=c+f;
    }
    void displayChildMoney()
    {
        System.out.println("Child Total Money : c = "+c);
    }
}


public class Multilevelnheritance
{
    public static void main(String [] args)
    {
        Child c = new Child();
        c.displayChildMoney();
    }
}