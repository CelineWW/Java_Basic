import java.util.Scanner;

public class LoopPatterns {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int loopVal;
      int i;
      int j;
   
      loopVal = scnr.nextInt();

      for (i = 1; i <= loopVal; ++i) {
         for  (j = 0; j < i; ++j) {
            System.out.print("*");
         }
         System.out.println(i);
      }

   }
}