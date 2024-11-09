import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
class Array1
{
    int n1,i;
    Scanner input = new Scanner(System.in);
    void getArrayElement()
    {
        System.out.println("Enter the size of Array:");
        n1=input.nextInt();
    }
    void displaySortingArrayList()
    {
        int [] matrix1 = new int [n1];
        System.out.println("Enter values for Array:");
        for(i=0;i<n1;i++)
        {
            matrix1[i]=input.nextInt();
        }
        Arrays.sort(matrix1);
        System.out.println("After sorting in assinding order:");
        for(i=0;i<n1;i++)
        {
            System.out.println(matrix1[i]+"\t");
        }
    }
    public static void main(String []agrs)
    {
        Array1 a1= new Array1();
        a1.getArrayElement();
        a1.displaySortingArrayList();

        Array1 a2= new Array1();
        a2.getArrayElement();
        a2.displaySortingArrayList(); 

        // List list = new ArrayList();
        // list.addAll(Arrays.asList(a1));
        // list.addAll(ArrayasList(a2));

        // ArrayList<Integer>num=new ArrayList<Integer>();
        // num.add(a1);
        // System.out.println(a3);
    }
}