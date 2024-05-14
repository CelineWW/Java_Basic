import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteSumVolumeFile {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      PrintWriter fOutWriter = null;
      String volumeFileName;
      double volumeData;
      int volumeValCount = 0;
		double sumValid = 0.0;
		
      volumeFileName = scnr.next();
      
      try {
         fOutWriter = new PrintWriter(new FileOutputStream(volumeFileName));
         for (volumeValCount = 0; volumeValCount < 2; ++volumeValCount) {
            volumeData = scnr.nextDouble();
            fOutWriter.println(volumeData);				
				sumValid += volumeData;
         }
      }
      catch (Exception e) {
         System.out.println("Error!");
      }

      finally {
         if (fOutWriter != null) {
            fOutWriter.println("Number of valid values read: " + volumeValCount);
            fOutWriter.println("Sum is: " + sumValid);
            fOutWriter.close();
         }
      }

   }
}