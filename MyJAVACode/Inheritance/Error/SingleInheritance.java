import java.util.Scanner;
class Mom
{
    private double m1;
    protected double m2;

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the money recived from Mom: ");
    m2 = sc.nextDouble();
}

public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Mom m = new Mom();
    }
}
