import java.util.Scanner;

public class CheackStringInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = {"Rohit","Arohi","Bishal","Niloy","Debjit"};
        System.out.print("Enter Your Name: ");
        String in=sc.nextLine();
        boolean flag=false;
        for(String i : name){
            if(i.compareToIgnoreCase(in)==0)
            {
                System.out.println("You are selected!!");
                flag=true;
                break;
            }
            
        }
        if (!flag) 
            System.out.println("You are not selected");
        // String s = "Hi Rohit";
        // String sw = new String("Hi Rohit");
        // System.err.println(s==sw);
        // System.out.println(s.equals(sw));
    }
}
