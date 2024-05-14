import java.util.Scanner;

public class NumberReverse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int MAX_ELEMETNS = 20;
      int[] userList;   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      int[] reverseList;
      int inputNum;
      int i;

      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      userList = new int[numElements];
      reverseList = new int[numElements];
      inputNum = 0;
      i = 0;
      while (i < numElements) {
    	 inputNum =  scnr.nextInt();
    	 userList[i] = inputNum;
    	 ++i;
    	  }
      
      for (i = 0; i < numElements; ++i) {
    	  reverseList[i] = userList[numElements - 1 - i];
    	  System.out.print("" + reverseList[i] + ",");
      }
      System.out.println();
   }
}
