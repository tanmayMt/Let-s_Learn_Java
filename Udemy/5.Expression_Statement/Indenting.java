class Indenting
{
    public static void main(String [] args)
    {
        int a=7;
        int b=10;
        int c=15;

        if (a>b && ++a<c);
        System.out.println("&&:  "+a);

        if (a>b & ++a<c);
        System.out.println("&:   "+a);
        
    }
}