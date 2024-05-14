import java.util.Scanner;

public class CharacterChecking {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
   
      userString = scnr.nextLine();

      if (Character.isLetter(userString.charAt(4))) {
         System.out.println("The fifth character is letter: " + userString.charAt(4));
      }
      else {
         System.out.println("The fifth character is not a letter.");
      }

   }
}