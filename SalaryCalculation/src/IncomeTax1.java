import java.util.Scanner;

public class IncomeTax1 {                         
   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      final String PROMPT_SALARY = "\nEnter annual salary (0 to exit): ";
      final String PROMPT_DEDUCTION = "Enter a deduction (0 to end deductions): ";
      int annualSalary;
      int oneDeduction;
      int totalDeductions;
      int adjustedSalary;
      double taxRate;
      int taxToPay;
  
      System.out.println(PROMPT_SALARY);
      annualSalary = scnr.nextInt();

      while (annualSalary > 0) {
         totalDeductions = 0;    // Start with 0 for each annual salary
         System.out.println(PROMPT_DEDUCTION);
         oneDeduction = scnr.nextInt();
         
         while (oneDeduction > 0) {
            totalDeductions += oneDeduction;
            System.out.println(PROMPT_DEDUCTION);
            oneDeduction = scnr.nextInt();
         }
         
         // Determine the tax rate from the adjusted salary
         adjustedSalary = annualSalary - totalDeductions;
         if (adjustedSalary <= 0) {
            adjustedSalary = 0;
            taxRate = 0.0;
         }
         else if (adjustedSalary <= 20000) {
            taxRate = 0.10;   // 0.10 is 10% written as a decimal
         }
         else if (adjustedSalary <= 50000) {
            taxRate = 0.20;
         }
         else if (adjustedSalary <= 100000) {
            taxRate = 0.30;
         }
         else {
            taxRate = 0.40;
         }

         taxToPay = (int)(adjustedSalary * taxRate);  // Truncate tax to an integer amount
         System.out.println("Annual salary: " + annualSalary); 
         System.out.println("\nDeductions: " + totalDeductions); 
         System.out.println("Adjusted salary after deductions: " + adjustedSalary);
         System.out.println("Tax rate: " + taxRate);
         System.out.println("Tax to pay: " + taxToPay);

         // Get the next annual salary
         System.out.println(PROMPT_SALARY);
         annualSalary = scnr.nextInt();
      } 
   } 
} 