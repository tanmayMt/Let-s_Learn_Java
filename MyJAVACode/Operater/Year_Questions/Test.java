import static java.lang.System.out;
public class Test
{
    public static void main(String [] args)
    {
        int x=0,y=0;
        x = 5 + y++;
        out.print(x+""+y);

        x=y=0;
        x = 5 + ++y;
        out.print(x+""+y);
    }
}