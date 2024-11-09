import java.util.Scanner;

public class StringPalindom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        boolean flag;

        System.out.print("Enter the string:");
        s1 = sc.nextLine();

        flag = check_palindom_string(s1);
        if (flag)
            System.out.printf("%s is Palindom: %b", s1, flag);
        else
            System.out.printf("%s is Palindom: %b", s1, flag);

    }

    private static boolean check_palindom_string(String s1) {
        if (s1.length() == 1 || s1.length() == 0)
            return true;
        else if (s1.charAt(0) == s1.charAt(s1.length() - 1))
            return check_palindom_string(s1.substring(1, s1.length() - 1));
        else
            return false;
    }
}
