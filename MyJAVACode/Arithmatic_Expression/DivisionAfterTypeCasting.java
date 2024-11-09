class DivisionAfterTypeCasting
{
    public static void main(String [] args)
    {
        float x,y;
        int a=6,b=4;

        x=a/b;         // x = 1.0
        y=(float)a/b;  // y = 1.5

        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }
}
