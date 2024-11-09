public class ConstructorOfStringClass3 {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String("This is String Literal");

        StringBuffer sb = new StringBuffer("This is StringBufferen Constans");
        String s3 = new String(sb);
    }
}
