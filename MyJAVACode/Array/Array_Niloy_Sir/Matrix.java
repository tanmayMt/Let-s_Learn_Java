import java.util.*;
class Matrix
{
    int a[][],rs,cs;
    Matrix(int rsize,int csize)
    {
        rs=rsize;
        cs=csize;
        a=new int[rs][cs];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<rs;i++)
          for(int j=0;j<cs;j++)
            a[i][j]=sc.nextInt();
    }
    void multiply()
    {
        for(int i=0;i<ar;i++)
          for(int j=0;j<bc;j++)
            for(int k=0;k<ac;k++)
              c[i][j]+=a[i][k]*b[k][j];
    }
    void display()
    {
        for(int i=0;i<ar;i++)
        {
            for(int j=0;j<ac;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the row-size and column-size for the first matrix ");
        int rs1=sc.nextInt();
        int cs1=sc.nextInt();
        
        System.out.println("Enter the row-size and column-size for the second matrix ");
        int rs2=sc.nextInt();
        int cs2=sc.nextInt();
        
        if(cs1!=rs2)
        {  
            System.out.println("Multiplication is not applicable");
            System.exit(-1);
        }
        
        Matrix A(rs1,cs1); // a[][], rs=rs1. cs=cs1
        Matrix B(rs2,cs2); // a[][], rs=rs2, cs=cs2
        Matrix C(rs1,cs2); // a[][], rs=rs1, cs=cs2

        System.out.println("Enter values for the 1st Matrix :");        
        A.input();
        System.out.println("Enter values for the 2nd Matrix :");  
        B.input();
        
        C=A.multiply(B);
        
        System.out.println("The first matrix ");
        A.display();
        System.out.println("The second matrix ");
        B.display();
        System.out.println("The resultant matrix ");
        C.display();       
    }
}
