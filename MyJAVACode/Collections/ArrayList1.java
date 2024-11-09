import java.util.ArrayList;
import java.util.Collections;

class ArrayList1{
    public static void main(String [] agrs)
    {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Joy");
        name.add("Raj");
        name.remove("Ena");
        name.add("Gioa");
        name.add(2,"Two");
        System.out.println(name);

        System.out.println(name.get(1));

        System.out.println(name.set(0,"Zero"));
        System.out.println(name);

        name.remove(1);
        System.out.println(name);


        Collections.sort(name);
        System.out.println(name);

         //
         ArrayList al = new ArrayList();
         al.add(21);
         al.add("AB");
         System.out.println(al);
    }
}