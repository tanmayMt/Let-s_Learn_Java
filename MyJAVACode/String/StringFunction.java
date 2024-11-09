public class StringFunction {
    public static void main(String[] args) {
        int number = 42;
        double decimal = 3.14;
        boolean flag = true;
        char character = 'A';
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};

        String numberString = String.valueOf(number);
        String decimalString = String.valueOf(decimal);
        String flagString = String.valueOf(flag);
        String charString = String.valueOf(character);
        String charArrayString = String.valueOf(charArray);

        System.out.println(numberString); // Output: 42
        System.out.println(decimalString); // Output: 3.14
        System.out.println(flagString);   // Output: true
        System.out.println(charString);   // Output: A
        System.out.println(charArrayString.getClass()); // Output: hello

        //codePointAt()
        // String myStr = "Hello";
        // int result = myStr.codePointAt(0);
        // System.out.println(result);

        //compare()
        String myStr1 = "A";
        String myStr2 = "B";
        System.out.println(myStr1.compareTo(myStr2)); // Returns 0 if they are equal

         //contains()
        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));    // false
       
        //containEquals()
        String myStr11 = "Hello";
        System.out.println(myStr11.contentEquals("Hello"));  // true

        //copyValueOf()
        //char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        // String myStr2 = "";
        // myStr2 = myStr2.copyValueOf(myStr1, 0, 4);
        // System.out.println("Returned String: " + myStr2);

        //endsWith()
        String my = "Hello";
        System.out.println(my.endsWith("Hel"));   // false
        System.out.println(my.endsWith("llo"));   // true

        //equals()
        // String myStr1 = "Hello";
        // String myStr2 = "Hello";
        // String myStr3 = "Another String";
        // System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        // System.out.println(myStr1.equals(myStr3)); // false

        //equalsIgnoreCase()
//      String myStr1 = "Hello";
//      String myStr2 = "HELLO";
//      String myStr3 = "Another String";
//      System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
//      System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
        
//         String myStr = "Hello %s! One kilobyte is %,d bytes.";
// String result = String.format(myStr, "World", 1024);
// System.out.println(result);

// String myStr = "Hello";
// byte[] result = myStr.getBytes();
// System.out.println(result[0]);

//
    // char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    // System.out.println(myArray);

    // String myStr = "Hello, World!";
    // myStr.getChars(7, 12, myArray, 4);
    // System.out.println(myArray);

   //lastIndexOf()
   String mySr = "Hello planet earth, you are a great planet.";
System.out.println(mySr.lastIndexOf("planet"));

    //String.join()
            String fruits = String.join(" ", "Orange", "Apple", "Mango");
    System.out.println(fruits);
    
    String regex = "cat|dog|fish";

System.out.println("cat".matches(regex));
System.out.println("dog".matches(regex));
System.out.println("catfish".matches(regex));
System.out.println("doggy bag".matches(regex));

//      //regionMatches()
//      String myStr1 = "Hello, World!";
// String myStr2 = "New World";
// System.out.println(myStr1.regionMatches(7, myStr2, 4, 5));
// System.out.println(myStr1.regionMatches(0, myStr2, 0, 5));

// String myStr = "Hello";
// System.out.println(myStr.replace('l', 'p'));

// String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
// String regex = "(?i)cat";
// System.out.println(myStr.replaceAll(regex, "dog"));

// String myStr = "Quest complete! Earned 30 gold and 500 experience.";
// String regex = "[0-9]+";
// System.out.println(myStr.replaceAll(regex, "($0)"));

// String myStr = "Split a string by spaces, and also punctuation.";
// String regex = "[,\\.\\s]";
// String[] myArray = myStr.split(regex);
// for (String s : myArray) 
//   System.out.println(s);

// String myStr = "Hello";
// System.out.println(myStr.startsWith("Hel"));   // true
// System.out.println(myStr.startsWith("llo"));   // false

// String myStr = "Hello, World!";
// System.out.println(myStr.subSequence(7, 12));

    // String myStr = "Hello, World!";
    // System.out.println(myStr.substring(7, 12));

//     String myStr = "Hello";
// char[] myArray = myStr.toCharArray();
// System.out.println(myArray[0]);

    char[] myArray = {'a', 'b', 'c'};
    System.out.println(String.valueOf(myArray));
    System.out.println(String.valueOf('A'));
    System.out.println(String.valueOf(true));
    System.out.println(String.valueOf(4.5f));
    System.out.println(String.valueOf(5.2));
    System.out.println(String.valueOf(12));
    System.out.println(String.valueOf(1400L));

    }
}