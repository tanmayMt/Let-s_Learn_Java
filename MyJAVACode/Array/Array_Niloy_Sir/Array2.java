import java.util.Scanner;
class Array2
{
    int n1,i;
    Scanner input = new Scanner(System.in);
    void getArrayLength()
    {
        System.out.println("Enter the size of Array:");
        n1=input.nextInt();
    }
    void inputAndDisplayArrayList()
    {
        int [] matrix1 = new int [n1];
        System.out.println("Enter values for Array:");
        for(i=0;i<n1;i++)
        {
            matrix1[i]=input.nextInt();
        }
        System.out.print("Values of the Array are:");
        for(i=0;i<n1;i++)
        {
            System.out.print(matrix1[i]+"\t");
        }
    }
    public static void main(String []agrs)
    {
        Array2 a1= new Array2();
        a1.getArrayLength();
        a1.inputAndDisplayArrayList();

        Array2 a2= new Array2();
        a2.getArrayLength();
        a2.inputAndDisplayArrayList();

        // List list = new ArrayList();
        // list.addAll(Arrays.asList(a1));
        // list.addAll(ArrayasList(a2));

        // ArrayList<Integer>num=new ArrayList<Integer>();
        // num.add(a1);
        // System.out.println(a3);
    }
}