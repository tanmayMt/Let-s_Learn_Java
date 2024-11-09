import java.util.Scanner;

class AToPowerOfB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, pow;

        System.out.print("Enter the value of A: ");
        a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        b = sc.nextInt();

        pow = pow(a, b);
        System.out.printf("%d^%d = %d\n", a, b, pow);
    }

    private static int pow(int a, int b) {
        if (b == 1)
            return a;
        else
            return a * pow(a, b - 1);
    }
}