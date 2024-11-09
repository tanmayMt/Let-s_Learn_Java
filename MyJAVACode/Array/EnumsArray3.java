public class EnumsArray3 {
    public static void main(String[] args) {
        sum(new int[] { 1, 2, 3 }); // Enums Array
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
    }
}