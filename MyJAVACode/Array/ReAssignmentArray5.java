public class ReAssignmentArray5 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 6, 8 };

        // a = b;
        // for (int i = 0; i < a.length; i++) {
        // System.out.printf("%d ", a[i]);
        // }
        // System.out.println();

        b = a;
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
