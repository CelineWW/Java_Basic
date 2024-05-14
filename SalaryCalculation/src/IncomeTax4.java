import java.util.Scanner;

public class IncomeTax4 {                         
   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      int annualSalary;
      double taxRate;
      int taxToPay;
      int startingAnnualSalary;
      int endingAnnualSalary;
      int incomeIncrement;

      System.out.println("Enter first annual salary for the table: ");
      startingAnnualSalary = scnr.nextInt();

      System.out.println("Enter last annual salary for the table: ");
      endingAnnualSalary = scnr.nextInt();

      System.out.println("Enter the increment for the table: ");
      incomeIncrement = scnr.nextInt();
      
      for (annualSalary = startingAnnualSalary; annualSalary <= endingAnnualSalary;
           annualSalary += incomeIncrement) {

         // Determine the tax rate from the annual salary
         if (annualSalary <= 0) {
            taxRate = 0.0;
         }
         else if (annualSalary <= 20000) {
            taxRate = 0.10;   // 0.10 is 10% written as a decimal
         }
         else if (annualSalary <= 50000) {
            taxRate = 0.20;
         }
         else if (annualSalary <= 100000) {
            taxRate = 0.30;
         }
         else {
            taxRate = 0.40;
         }

         taxToPay = (int)(annualSalary * taxRate);   // Truncate tax to an integer amount
         System.out.println("Annual salary: " + annualSalary + 
                            "\tTax rate: " + taxRate +
                            "\tTax to pay: " + taxToPay);
      } 
   }
}