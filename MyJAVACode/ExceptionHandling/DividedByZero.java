class DividedByZero
{
    public static void main(String[] args)
    {
        int a,b,x;
        a=22;
        b=0;
        try
        {
            x=a/b;
            System.out.println("Result: "+x);
            throw new ArithmeticException();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}