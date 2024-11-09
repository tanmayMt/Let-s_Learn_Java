import java.util.Scanner;

public class FibonacciSerise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fib;

        System.out.print("Enter a positive value:");
        n = sc.nextInt();

        fib = fibb(n);
        System.out.println("fib=" + fib);

        for (int i = 0; i <= n; i++)
            System.out.print(fibb(i) + " ");
    }

    private static int fibb(int n) {
        if (n == 0 || n == 1)
            return n;
        else {
            return fibb(n - 1) + fibb(n - 2);
        }
    }
}
