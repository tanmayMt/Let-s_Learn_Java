import java.util.Scanner;
class Array3
{
    public static void main(String []agrs)
    {
        int n1,i;

        //Size of the Array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        n1=input.nextInt();

        // Take input for Array
        int [] matrix1 = new int [n1];
        System.out.println("Enter values for Array:");
        for(i=0;i<n1;i++)
        {
            matrix1[i]=input.nextInt();
        }

        //Display Array elements
        System.out.print("Values of the Array are:");
        for(i=0;i<n1;i++)
        {
            System.out.print(matrix1[i]+" ");
        }
    }//End of main() method
}//End of class body