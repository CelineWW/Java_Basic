import java.util.Scanner;

public class ExceptionWithArrays {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
      int index;

	  index = scnr.nextInt();
      try {
    	  if (index < 0 ) {
    		  throw new ArrayIndexOutOfBoundsException("Exception! Index " + index + " out of bounds for length " + names.length + "\nThe closest name is: " + names[0] + "\n");
    	  }
    	  else if (index > 9) {
    		  throw new ArrayIndexOutOfBoundsException("Exception! Index " + index + " out of bounds for length " + names.length + "\nThe closest name is: " + names[9] + "\n");
    	  }
    	  System.out.println("Name: " + names[index]);   // if put this line before if- else if, it only output "Index 10 out of bounds for length 10" out of bound message.

      }
      catch (ArrayIndexOutOfBoundsException e) {
          System.out.println(e.getMessage());
      }
   }
}
