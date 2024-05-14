import java.util.Scanner;
import java.util.InputMismatchException;

public class ColorIntensity {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int colorIntensity;

      try {
         colorIntensity = scnr.nextInt();
         if ((colorIntensity < 0) || (colorIntensity > 255)) {
             throw new Exception("Value error: Value between 0 and 255 required");
         }
         System.out.print("Valid input: ");
         System.out.println("Color intensity is " + colorIntensity);
      }
      
      
      catch (InputMismatchException e) {
      System.out.println("Input type error: Integer required.");
      }
      
      catch (Exception e) {
      System.out.println(e.getMessage());
      }

   }
}