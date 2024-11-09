class ShortCircuitLogicalOperator
{
    public static void main(String [] args)
    {
        int a,b,c,d;
        a=1;b=5;c=7;d=9;

        if(a>b && ++a<d);
        System.out.println("(After use &&) a= "+a);

        if(a>b & ++a<d);
        System.out.println("(After use &)  a= "+a);
    }
}