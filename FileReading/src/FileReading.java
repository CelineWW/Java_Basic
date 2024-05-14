import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = null;
      Scanner shelfFS = null;
      String dataFileName;
      int shelfCount;
		int unsoldShelves;

      dataFileName = scnr.next();

      fileByteStream = new FileInputStream(dataFileName);
      shelfFS = new Scanner(fileByteStream);
		unsoldShelves = 350;
		System.out.println("Started with: " + unsoldShelves);

      while(shelfFS.hasNextInt()){
         shelfCount = shelfFS.nextInt();
         System.out.println(shelfCount);
         unsoldShelves -= shelfCount;
      }

      if (shelfFS.hasNext()) {
         System.out.println("Reading stopped at " + shelfFS.next());
      }
      else {
         System.out.println("Reached end of file");
      }

		System.out.println("Remaining: " + unsoldShelves);

      fileByteStream.close();
   }
}