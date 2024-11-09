//G:\Programming\Java\MyJAVACode\String\OjectCreation.java
public class OjectCreation {
    public static void main(String[] args) {
        String s1 = new String("You cannot change me");
        String s2 = new String("You cannot change me");
        System.out.println("s1 == s2 : " + s1 == s2);

        String s3 = "You cannot change me";
        System.out.printf("s1 == s3: %b\n", s1 == s3);

        String s4 = "You cannot change me";
        String s5 = "You cannot change me";
        System.out.println(s4 == s5);

        String s6 = "You cannot";
        String s7 = s6 + " change me";
        System.out.println("s6 == s7: " + s6 == s7);

        String s8 = "You cannot";
        String s9 = s8 + " change me";
        System.out.println("s4 == s9: " + s4 == s9);
    }
}
