import java.util.Scanner;

public class LargestValues {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numIn;
      int inputValue;
      int largestVal = 0;
      int i;

      numIn = scnr.nextInt();

      for (i = 0; i < numIn; ++i) {
         inputValue = scnr.nextInt();
         System.out.println("Value read: " + inputValue);
         if (i == 0) {
            largestVal = inputValue;
         }
         else if (inputValue > largestVal) {
            largestVal = inputValue;
         }
      }
      System.out.println("Largest: " + largestVal);

   }
}