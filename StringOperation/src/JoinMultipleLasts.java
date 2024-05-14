import java.util.Scanner;

public class JoinMultipleLasts {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String batch1;
		String batch2;
		String batch3;
      String lastOfBatch1;
		String lastOfBatch2;
		String lastOfBatch3;
		String lastsInAll;
      
      batch1 = scnr.nextLine();
		batch2 = scnr.nextLine();
		batch3 = scnr.nextLine();

      lastOfBatch1 = batch1.substring(batch1.lastIndexOf('+') + 1, batch1.indexOf(']'));
      lastOfBatch2 = batch2.substring(batch2.lastIndexOf('+') + 1, batch2.indexOf(']'));
      lastOfBatch3 = batch3.substring(batch3.lastIndexOf('+') + 1, batch3.indexOf(']'));
      lastsInAll = lastOfBatch1 + "+" + lastOfBatch2 + "+" + lastOfBatch3;
      System.out.println(lastsInAll);
   }
}