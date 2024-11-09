import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm = new HashMap<>();
        hm.put(1,"Raj");
        hm.put(2,"Joy");
        hm.put(3,"Roh");hm.put(4,"Sam");

        System.out.println(hm);

        System.out.println(hm.get(3));
        System.out.println(hm.keySet());
    }
}
