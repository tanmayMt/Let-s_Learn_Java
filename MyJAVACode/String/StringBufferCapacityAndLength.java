public class StringBufferCapacityAndLength {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("Default Capacity: " + sb.capacity());

        sb.append("1234567891234567");
        System.out.println(sb.capacity());

        sb.append("12345678912345678");
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("Durga");
        System.out.println(sb.capacity());

        StringBuffer sb2 = new StringBuffer("Durga");
        sb2.append(3);
        sb2.append(3.5);

        System.out.println(sb2);

    }
}
