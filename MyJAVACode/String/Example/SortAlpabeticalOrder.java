package Example;
import java.util.*;
public class SortAlpabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] city = new String[5];
        String t;
        for(int i=0;i<city.length;i++){
            city[i]=sc.next();
        }
        System.out.println("Before Sorting: ");
        for(int i=0;i<city.length;i++){
            System.out.print(city[i]+" ");
        }

        //Sorting
        for(int i=0;i<city.length;i++){
            for(int j=i+1;j<city.length;j++)
            {
                if (city[i].compareTo(city[j])>0) {
                    t=city[i];
                    city[i]=city[j];
                    city[j]=t;
                }
            }
        }

        System.out.println("After Sorting: ");
        for(int i=0;i<city.length;i++){
            System.out.print(city[i]+" ");
        }


    }
}
