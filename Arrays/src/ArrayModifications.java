import java.util.Scanner;

public class ArrayModifications {

   public static void subtractIndexFromElements(int[] arr) {
      int i;
      for (i = 0; i < arr.length; ++i) {
         arr[i] = arr[i] - i;
      }
   }

   public static void printArr(int[] arr) {
      int i;

      for (i = 0; i < arr.length; ++i) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 6;
      int[] myArray = new int[NUM_ELEMENTS];
      int i;
      int userNum;

      for (i = 0; i < myArray.length; ++i) {
         myArray[i] = scnr.nextInt();
      }

      System.out.print("Original array: ");
      printArr(myArray);

      subtractIndexFromElements(myArray);

      System.out.print("Changed array: ");
      printArr(myArray);
   }
}