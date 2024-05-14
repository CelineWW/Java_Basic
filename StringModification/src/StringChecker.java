import java.util.Scanner;

public class StringChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inString;
      
      inString = scnr.nextLine();
      boolean allAlphas = true;
      for (int i=0; i<3; i++) {
         if (!Character.isLetter(inString.charAt(i))) {
            allAlphas = false;
            break;
         }
      }

      if (allAlphas) {
         System.out.println("Valid string");
      }
      else {
         System.out.println("Invalid string");
      }
   }
}