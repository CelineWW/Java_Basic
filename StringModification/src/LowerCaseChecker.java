import java.util.Scanner;

public class LowerCaseChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inString;

      inString = scnr.nextLine();
      boolean hasLowercase = false;
      for (int i = 0; i < 2; i++) {
//         if ((Character.isLetter(inString.charAt(i))) && (Character.toUpperCase(inString.charAt(i)) != inString.charAt(i))) {
    	  if (Character.toLowerCase(inString.charAt(i)) == inString.charAt(i)) {
    		hasLowercase = true;
            break;
         }
      }

      if (hasLowercase) {
         System.out.println("String accepted");
      }
      else {
         System.out.println("String not accepted");
      }
   }
}