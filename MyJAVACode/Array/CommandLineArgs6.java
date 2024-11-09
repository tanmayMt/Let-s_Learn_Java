public class CommandLineArgs6 {
    public static void main(String[] args) {
        // i < args.length
        for (int i = 0; i < args.length; i++) {
            System.out.println(" " + args[i]);
        }
        System.out.println();

        // i <= args.length
        for (int i = 0; i <= args.length; i++) {
            System.out.println(" " + args[i]);
        }
    }
}
