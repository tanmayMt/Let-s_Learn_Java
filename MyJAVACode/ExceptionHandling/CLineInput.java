//Catching invalid command line argument
class CLineInput {
    public static void main(String[] args) {
        int invalid = 0;
        int valid = 0;
        int n;
        for (int i = 0; i < args.length; i++) {
            try {
                n = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalid++;
                System.out.println("Invalid Number: " + args[i]);
                continue;
            }
            valid++;
        }
        System.out.println("\nValid Numbers: " + valid);
        System.out.println("Invalid Numbers: " + invalid);
    }
}