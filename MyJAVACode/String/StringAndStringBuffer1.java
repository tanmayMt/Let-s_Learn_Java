import java.lang.String;
import java.lang.StringBuffer;

class StringAndStringBuffer1 {
    public static void main(String[] args) {
        // String
        String s1 = new String("Durga");
        s1.concat("Sir");
        // String s2 = s1.concat("Sir");
        System.out.println("s1: " + s1);

        // StringBuffer
        StringBuffer sb = new StringBuffer("Durga");
        sb.append(" Sir");
        System.out.println("sb: " + sb);
    }
}