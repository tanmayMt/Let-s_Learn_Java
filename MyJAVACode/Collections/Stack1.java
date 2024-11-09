
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();
        s1.push("Raj");
        s1.push("RDdf");
        s1.push("Deb");
        if(!s1.empty())
           s1.pop();
        
        System.out.println(s1.peek());
        System.out.println("s1: "+s1);
    }
}
