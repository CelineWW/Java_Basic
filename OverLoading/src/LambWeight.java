import java.util.Scanner;

public class LambWeight {
   public static void printLambWeight(int lambWeight) {
      System.out.println("Lamb weight as a whole number: " + lambWeight + " pounds");
   }

   public static void printLambWeight(double lambWeight) {
      System.out.printf("Lamb weight to three decimal places: %.3f pounds\n", lambWeight);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int lambWeight1;
      double lambWeight2;
      
      lambWeight1 = scnr.nextInt();
      lambWeight2 = scnr.nextDouble();
      
      printLambWeight(lambWeight1);
      printLambWeight(lambWeight2);
   }
}