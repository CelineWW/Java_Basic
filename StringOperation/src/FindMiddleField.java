import java.util.Scanner;

public class FindMiddleField {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String internetDomain;
		int index1;
		int index2;
      
      internetDomain = scnr.nextLine();

      index1 = internetDomain.indexOf('.');
      index2 = internetDomain.indexOf('.', index1 + 1);
      System.out.println(internetDomain.substring(index1 + 1, index2));

   }
}