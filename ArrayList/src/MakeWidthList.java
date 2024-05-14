import java.util.Scanner;
import java.util.ArrayList;

public class MakeWidthList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numWidths;
      int i;
      numWidths = scnr.nextInt();
      ArrayList<Double> widthList = new ArrayList<Double>(numWidths);
      for (i = 0; i < numWidths; ++i) {
         widthList.add(scnr.nextDouble());
      }
      
      // Traversing a list using indexes
      for (i = 0; i < widthList.size(); ++i) {
         System.out.print(widthList.get(i) + " ");
      }
      System.out.println();
   }
}