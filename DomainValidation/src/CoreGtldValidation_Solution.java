import java.util.Scanner;

public class CoreGtldValidation_Solution {                         
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
      int periodCounter;
      int periodPosition;
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

         // Count the number of periods in the domain name
         periodCounter = 0;
         for (i = 0; i < searchName.length(); ++i) {
            if (searchName.charAt(i) == '.') {
               ++periodCounter;
               periodPosition = i;
            }
         }

         // If there is exactly one period that is not at the start
         // of searchName, check if the TLD is a core gTLD
         if ((periodCounter == 1) && (searchName.charAt(0) != '.')) {
            // Extract the TLD name starting at the period's position. Ex:
            // If searchName = "apple.com", the next statement extracts ".com"
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
         }
  
         System.out.print("\"" + inputName + "\" ");
         if (isCoreGtld) {
            System.out.println(" is a second-level domain followed by a core gTLD of \"" +
                               theTld + "\".");
         }
         else {
            System.out.println("is not a second-level domain followed by a core gTLD.");
         }

         System.out.println("\nEnter the next domain name (or <Enter> to exit): ");
         inputName  = scnr.nextLine();
      }
   } 
}