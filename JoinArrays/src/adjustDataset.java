import java.util.Scanner;

public class Dataset {
   public static int[] adjustDataset(int[] tempList, int numMore) {
      int i;

      int[] resultArray = new int[tempList.length + numMore];

      for (i = 0; i < tempList.length; ++i) {
         resultArray[i] = tempList[i];
      }

      return resultArray;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] degreesFahrenheit = new int[3];
      int input;
      int i;

      for (i = 0; i < degreesFahrenheit.length; ++i) {
         degreesFahrenheit[i] = scnr.nextInt();
      }
        
      // Read number of values to increase array size by
      input = scnr.nextInt();

      degreesFahrenheit = adjustDataset(degreesFahrenheit, input);

      for (i = 0; i < degreesFahrenheit.length; ++i) {
         System.out.print(degreesFahrenheit[i] + " ");
      }
   }
}