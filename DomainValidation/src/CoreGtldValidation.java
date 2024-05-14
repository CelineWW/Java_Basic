import java.util.Scanner;

public class CoreGtldValidation {                         
   public static void main (String [ ] args) { 
      Scanner scnr = new Scanner(System.in);
      String coreGtld1;
      String coreGtld2;
      String coreGtld3;
      String coreGtld4;
      String inputName;
      String searchName;
      String theTld;
      boolean isCoreGtld;
      // FIXME: Add variable periodCounter to count periods in a domain name
      int periodPosition;   // Position of the period in the domain name
      int i;

      coreGtld1 = ".com";
      coreGtld2 = ".net";
      coreGtld3 = ".org";
      coreGtld4 = ".info";
      theTld = "";
      isCoreGtld = false;
      periodPosition = 0;

      System.out.println("\nEnter the next domain name (<Enter> to exit): ");
      inputName  = scnr.nextLine();

      while (inputName.length() > 0) {
         searchName = inputName.toLowerCase();
         isCoreGtld = false;
         
         // FIXME: Write a for loop using variable i to store in periodCounter
         //        the number of periods in searchName. Store the position of the 
         //        period in periodPosition. If searchName has exactly one period
         //        and searchName's first character is not a period, determine
         //        whether searchName has a valid core gTLD by extracting the
         //        domain name into variable coreGtld and comparing the name with 
         //        valid core gTLDs.

         // Extract the top-level domain name starting at the period's position.
         // Ex: If searchName = "example.com", the next statement extracts ".com"
         theTld = searchName.substring(periodPosition);

         if (theTld.equals(coreGtld1)) {
            isCoreGtld = true;
         }
         else if (theTld.equals(coreGtld2)) {
            isCoreGtld = true;
         }
         else if (theTld.equals(coreGtld3)) {
            isCoreGtld = true;
         }
         else if (theTld.equals(coreGtld4)) {
            isCoreGtld = true;
         }
         else {
            isCoreGtld = false;
         }
         
         System.out.print("\"" + inputName + "\" ");
         if (isCoreGtld) {
            System.out.println(" is a second-level domain followed by a core gTLD of \"" +
                               theTld + "\"");
         }
         else {
            System.out.println("is not a second-level domain followed by a core gTLD.");
         }

         System.out.println("\nEnter the next domain name (or <Enter> to exit): ");
         inputName  = scnr.nextLine();
      }
   } 
}