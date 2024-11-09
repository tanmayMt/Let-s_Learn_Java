public class StringBufferFunctions {
   public static void main(String[] args) {
      StringBuffer sb = new StringBuffer("Object Language");
      int pos = sb.indexOf("Language");
      sb.insert(pos, "Oriented ");
      System.out.println("\n"+sb);
   } 
}
