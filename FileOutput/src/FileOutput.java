import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileOutputStream fileStream = null;
      PrintWriter fileWriter = null;
      double okraWeight;
      String guestName;

      okraWeight = scnr.nextDouble();
      guestName = scnr.next();
  
      fileStream = new FileOutputStream("output.txt");
      fileWriter = new PrintWriter(fileStream);

      fileWriter.println("Pick up:");
      fileWriter.println("= # = # = # =");
      fileWriter.println("" + okraWeight + " kilograms of okras for " + guestName);
      fileWriter.close();

   }
}