import java.util.Scanner;

public class StrinReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;

        System.out.print("Enter the String: ");
        s1 = sc.nextLine();

        s1 = reverse_string(s1);
        System.out.println(s1);
    }

    private static String reverse_string(String s1) {
        if (s1.length() == 0)
            return "";
        else
            return reverse_string(s1.substring(1)) + s1.charAt(0);
    }
}
