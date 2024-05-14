import java.util.Scanner;

public class PositiveIntegers {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numIn;
      boolean allPositive = true;
      int i;
      int inputValue;
      
      numIn = scnr.nextInt();
      for (i = 0 ; i < numIn; ++i) {
         inputValue = scnr.nextInt();
         if (inputValue > 0) {
            allPositive = true;
         }
         else {
            allPositive = false;
            break;
         }
      }

      if (allPositive) {
         System.out.println("All match");
      }
      else {
         System.out.println("Not all match");
      }
   }
}