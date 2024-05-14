import java.util.Scanner;

public class StringOrder {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String firstString;
      String secondString;

      firstString  = scnr.next();
      secondString = scnr.next();

      scnr.close();
      
      if (firstString.compareTo(secondString) < 0) {
         System.out.println(firstString + ' ' + secondString);
      }
      else {
         System.out.println(secondString + ' ' + firstString);
      }

   }
}