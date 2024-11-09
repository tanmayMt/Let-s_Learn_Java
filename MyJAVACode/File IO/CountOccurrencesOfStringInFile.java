/*
 2011-12
 Write a program in java that takes a file name and a search 
 string from the user. If the search string occurs in the 
 file, then it counts the number of occurrences of the string.
 (Assume that search pattern can exist more than two times in a line).
 */

 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileReader;
 import java.io.IOException;
 
 public class CountOccurrencesOfStringInFile {
 
     public static void main(String[] args) throws IOException {
         // Get the file name and search string from the user.
         System.out.print("Enter the file name: ");
         String fileName = System.console().readLine();
         System.out.print("Enter the search string: ");
         String searchString = System.console().readLine();
 
         // Create a File object for the file.
         File file = new File(fileName);
 
         // Create a BufferedReader object to read the file.
         BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
 
         // Initialize the count of occurrences to 0.
         int count = 0;
 
         // Read each line from the file.
         String line;
         while ((line = bufferedReader.readLine()) != null) {
 
             // Find the index of the search string in the line.
             int index = line.indexOf(searchString);
 
             // If the search string is found in the line, increment the count.
             while (index != -1) {
                 count++;
                 index = line.indexOf(searchString, index + searchString.length());
             }
         }
 
         // Close the BufferedReader object.
         bufferedReader.close();
 
         // Print the number of occurrences of the search string.
         System.out.println("The search string \"" + searchString + "\" appears " + count + " times in the file.");
     }
 }
 
