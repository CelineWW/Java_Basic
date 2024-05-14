import java.util.Scanner;

public class POBoxPatterns {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      char currentRowLetter;
      int currentColumn;
      int currentColumnInteger;
   
      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      currentRowLetter = 'A';
      currentRow = 0;
      currentColumn = 0;
      currentColumnInteger = 1;
      while(currentRow < numRows ) {
         while (currentColumnInteger <= numColumns){
            System.out.print("" + currentRowLetter + currentColumnInteger + " ");
            ++currentColumnInteger;
            ++currentColumn;
         }
         ++currentRowLetter;
         ++currentRow;
         System.out.print("\n");
         currentColumn = 0;
         currentColumnInteger = 1;
      }
   }
}