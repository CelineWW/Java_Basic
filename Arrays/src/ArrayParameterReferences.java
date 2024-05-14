/*
 * 
 * Four integers are read from input and stored into the array numberArray. Then, numCompare is read from input. Write a static method filterArray() that takes an integer array parameter and an integer parameter. For each element in the array, if the element is less than or equal to the integer parameter, then replace the element with 0. Otherwise, replace the element with 1.
 * Ex: If the input is:
 * 20 50 80 65
 * 53
 * then the output is:
 * Input array: 20 50 80 65 
 * Output array: 0 0 1 1 * 
 * 
 */


import java.util.Scanner;

public class ArrayParameterReferences {

   public static void filterArray(int[] arr, int compare) {
      int i;
      int result = 0;
      for(i = 0; i < arr.length; ++i) {
         if (arr[i] <= compare) {
            arr[i] = 0;
         } else {
            arr[i] = 1;
         }  
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
      final int NUM_ELEM = 4;
      int[] numberArray = new int[NUM_ELEM];
      int i;
      int numCompare;

      for (i = 0; i < numberArray.length; ++i) {
         numberArray[i] = scnr.nextInt();
      }
      numCompare = scnr.nextInt();

      System.out.print("Input array: ");
      printArr(numberArray);

      filterArray(numberArray, numCompare);

      System.out.print("Output array: ");
      printArr(numberArray);
   }
}