public class MethodForPrintingExceptionInformation6 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.print("e.printStackTrace(): ");
            e.printStackTrace();

            System.out.print("\ne.toString(): " + e.toString());
            // System.out.print(e);

            System.out.print("\ne.getMessage(): " + e.getMessage());

        }
    }
}
