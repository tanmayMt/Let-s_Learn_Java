import java.lang.Exception;
import java.util.Scanner;

class Limit extends Exception {

    Limit(String message) {
        super(message);
    }
}

public class UserDefineException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter the age of the patients: ");
        age = sc.nextInt();

        try {
            if (age < 0)
                throw new Limit("Invalid Input" + age);
        }

        catch (Limit e) {
            System.out.println("Error: " + e.getMessage());
            // System.exit(age);
        }
    }
}
