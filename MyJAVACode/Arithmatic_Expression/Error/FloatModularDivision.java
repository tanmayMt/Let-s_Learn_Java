class FloatModularDivision
{
    public static void main(String [] args)
    {
        float a,b;
        a=16.5f;
        b=1.25f;

        System.out.println("a%b= "+a%b);    // 0.25
        System.out.println("a/b= "+a/b);    //13.2

        /*
         Modular division can also be done on floats. if a and b are
         floats then a%b is computed as a-n*b, where n is the largest
         possible integer that is lesss than or equal to a/b.
         Thus 16.5f % 1.25f yieds 0.25
         */

         System.out.println("Type of 23: "+((Object)(a%b)).getClass().getSimpleName());
    }
}