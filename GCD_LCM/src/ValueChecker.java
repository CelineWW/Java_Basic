import java.util.Scanner;

public class ValueChecker {

   public static boolean checkValues(Scanner scnr) {
      boolean odd = true;
      int val = 0;
      while (val != -1) {
         val = scnr.nextInt();
         if (val == -1) {
        	 break;
         }
         else if (val % 2 != 1){
            odd = false;
            break;
         } 
      }
      return odd;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      boolean allOdd;
      
      allOdd = checkValues(scnr);
      if (allOdd) {
			System.out.println("All true");
		}
		else {
			System.out.println("Not all true");
		}
   }
}