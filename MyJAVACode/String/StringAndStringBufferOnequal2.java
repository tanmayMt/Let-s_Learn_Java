import java.lang.String;
import java.lang.StringBuffer;

class StringAndStringBufferOnequal2 {

    public static void main(String[] args) {

        String s1 = new String("Durga");
        String s2 = new String("Durga");
        System.out.println("In String, s1 == s2 : " + (s1 == s2));
        System.out.println("In String, s1.equals(s2) : " + s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("Durga");
        StringBuffer sb2 = new StringBuffer("Durga");
        System.out.println("In StringBuffer, sb1 == sb2 : " + (sb1 == sb2));
        System.out.println("In StringBuffer, sb1.equals(sb2) : " + sb1.equals(sb2));

    }
}