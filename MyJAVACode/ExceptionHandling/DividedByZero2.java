class DividedByZero2
{
    static void divide() throws ArithmeticException
    {
        int a,b,x;
        a=22;
        b=0;
        x=a/b;
        System.out.println("Result: "+x);
    }
    public static void main(String[] args) 
    {
        try
        {
            divide();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught the exception: "+e);
        }
    }
}
