import java.util.Scanner;
class Example
{

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int num=s.nextInt();
        int [] a = new int [num]; 

        System.out.print("Enter Array Elements");
        for(int i=0;i<num;i++)
            a[i]=s.nextInt();
        for(int b:a)
           System.out.print(b+" ");
    }
}