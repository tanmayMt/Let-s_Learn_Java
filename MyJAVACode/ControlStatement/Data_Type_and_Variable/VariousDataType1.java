import java.lang.*;
class VariousDataType1
{
    public static void main(String [] args)
    {
        int i;
        byte b;
        short s;

        float f;
        double d;

        boolean b1;
        boolean b2;

        i=5;
        b=127;
        s=32767;

        f=5.5f;
        d=6.56;

        b1=true;
        b2=false;

        
        System.out.format("i=%d  b=%b  s=%d",i,b,s);
  

        System.out.println("\n\n"+Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(Character.MAX_VALUE);
    }
}