
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(23);
        ll.add(43);
        ll.add(21);
        ll.add(55);

        ll.remove(2);

        // for(int i:ll)
        //     System.out.print(i+" ");
        // System.out.println();
        
        //set() & get()
        ll.set(2, 100);
        System.out.println("ll.get(2): "+ll.get(2));

        // for(int i:ll)
        //     System.out.print(i+" ");
        // System.out.println();

        //Search a item from linkedList
        System.out.print("Search a item from linkedList: ");
        int in = sc.nextInt();

        int i=0;
        boolean flag=false;
        for (int each : ll) {
            if(in == each){
                System.out.println("Found at pos: "+ll.indexOf(in));
                flag=true;
            }
            i++;
        }
        if(!flag)
           System.out.println("Not Found");
    }
}
