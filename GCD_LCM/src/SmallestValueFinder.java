import java.util.Scanner;

public class SmallestValueFinder {

   public static int findSmallestValue(Scanner scnr) {
      int val = 0;
      int minVal = 0;
      while (val <= 0) {
         val = scnr.nextInt();
         if (minVal > val) {
            minVal = val;
         }
      }
      return minVal;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int minVal;
      
      minVal = findSmallestValue(scnr);
      
      System.out.println(minVal);
   }
}