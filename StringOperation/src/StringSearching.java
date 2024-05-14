import java.util.Scanner;

public class StringSearching {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String wordString;
      int index;
      
      wordString = scnr.next();

      index = wordString.indexOf('f', 2);
      if (index == -1) {
         System.out.println("Character 'f' is not found at or after index 2.");
      }
      else {
         System.out.println("Starting at index 2, the first occurrence of character 'f' is at index "
         + index + ".");
      }
   }
}