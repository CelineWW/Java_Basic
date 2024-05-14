import java.util.Scanner;

public class StringComparison{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userWord;

      System.out.print("Enter a word: ");
      userWord = scnr.next();

      if (userWord.equals("USA")) {
         System.out.println("United States of America");
      } 
      else {
         System.out.println(userWord);
      }
   }
}