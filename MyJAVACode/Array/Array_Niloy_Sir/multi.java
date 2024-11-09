
import java.util.Scanner;
class Multi
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int r1,c1,r2,c2,i,j,k;

        System.out.println("Enter the row size and column size of the 1st matrix");
        r1=input.nextInt();
        c1=input.nextInt();

        System.out.println("Enter the row size and column size of the 2nd matrix");
        r2=input.nextInt();
        c2=input.nextInt();

        int [][] a =new int [r1][c1];
        int [][] b =new int [r2][c2];
        int [][] c =new int [r1][c1];

        if (c1 !=  r2)
        {
            System.out.println("Not Possible");
            System.exit(-1);
        }

        //INPUT
        System.out.println("Enter value for 1st matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter value for 2nd matrix:");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=input.nextInt();
            }
        }

        //Calculation of Multiplication
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                c[i][j]=0;
                for(k=0;k<c1;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        //Matrix1
        System.out.println("Matrix1=");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.println(a[i][j]+"\t");
            }
            System.out.println();
        }
        //Matrix2
        System.out.println("Matrix2=");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.println(a[i][j]+"\t");
            }
            System.out.println();
        }
        //output
        System.out.println("Multiplication=");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.println(c[i][j]);
            }
        }
    }
}